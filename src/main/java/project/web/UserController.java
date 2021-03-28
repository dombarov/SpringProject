package project.web;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.models.binding.UserRegisterBindingModel;
import project.models.entity.UserRoleEntity;
import project.models.entity.enums.UserRole;
import project.models.service.UserServiceModel;
import project.service.CarService;
import project.service.UserService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final CarService carService;

    public UserController(ModelMapper modelMapper, UserService userService, CarService carService) {
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.carService = carService;
    }

    @GetMapping("/register")
    public String getRegister(Model model) {
        if (!model.containsAttribute("userRegisterBindingModel")) {
            model.addAttribute("userRegisterBindingModel", new UserRegisterBindingModel());
        }

        return "register";
    }

    @PostMapping("/register")
    public String registerConfirm(@Valid UserRegisterBindingModel userRegisterBindingModel, BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors() || !userRegisterBindingModel.getPassword().equals(userRegisterBindingModel.getConfirmPassword())) {
            redirectAttributes.addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegisterBindingModel", bindingResult);
            return "redirect:register";
        }
        if (userService.ifUserExist(userRegisterBindingModel.getUsername())) {
            redirectAttributes.addFlashAttribute("userRegisterBindingModel", userRegisterBindingModel);
            redirectAttributes.addFlashAttribute("userExist", true);

            return "redirect:register";
        }
        this.userService.register(this.modelMapper.map(userRegisterBindingModel, UserServiceModel.class));

        return "redirect:login";


    }

    @GetMapping("/login")
    public String getLogin(Model model) {
        return "login";
    }


    @PostMapping("/login-error")
    public ModelAndView errorLogin(@ModelAttribute("username") String username,
                                   RedirectAttributes redirectAttributes) {
        ModelAndView modelAndView = new ModelAndView();
        redirectAttributes.addFlashAttribute("error", true);
        redirectAttributes.addFlashAttribute("username", username);

        modelAndView.setViewName("redirect:/users/login");
        return modelAndView;

    }

    @GetMapping("/add")
    public String findAllRole(Model model) {

        model.addAttribute("names", this.userService.findAllUsername());
//       model.addAttribute("roles", this.userService.findRole());
        return "admin";
    }

    @GetMapping("/add/{id}")
    public String addConfirm(@PathVariable String id){
        System.out.println();
        userService.changeRole(id);
//        userService.deleteByID(id);

        return "redirect:/users/add";
    }



    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable String id){
        carService.findById(id);
        carService.deleteById( id);
        return "redirect:/view/cars";
    }


}
