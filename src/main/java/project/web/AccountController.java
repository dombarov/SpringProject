package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.service.CarService;

@Controller
@RequestMapping("my")
public class AccountController {
    private final CarService carService;

    public AccountController(CarService carService) {
        this.carService = carService;
    }


//    @GetMapping("/account")
//    public String getAccount() {
//        return "account";
//
//    }

    @GetMapping("/account")
    public ModelAndView getCarBut(@RequestParam("id") String id, ModelAndView modelAndView) {


        modelAndView.addObject("carforBuy", this.carService.findById(id));
//        modelAndView.addObject("allCar", this.carService.findAllItems());
//        modelAndView.addObject("sum", this.carService.getTotalSum());
        modelAndView.setViewName("account");
        return modelAndView;

    }




    @GetMapping("/buy/{id}")
    public String buyById(@PathVariable String id, RedirectAttributes redirectAttributes, Model model) {

        carService.buyById(id);


        return "redirect:/";
    }
}
