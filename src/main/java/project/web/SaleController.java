package project.web;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.models.binding.CarForSaleBindingModel;
import project.models.service.CarSaleServiceModel;
import project.service.CarSaleService;
import project.service.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/sale")
public class SaleController {
    private final ModelMapper modelMapper;
    private final CarSaleService carSaleService;
    private final UserService userService;


    public SaleController(ModelMapper modelMapper, CarSaleService carSaleService, UserService userService) {
        this.modelMapper = modelMapper;
        this.carSaleService = carSaleService;
        this.userService = userService;
    }

    @GetMapping("/car")
    public String sale(Model model){
        if (!model.containsAttribute("carForSaleBindingModel")){
            model.addAttribute("carForSaleBindingModel", new CarForSaleBindingModel());
        }
        return "sale-car";
    }

    @PostMapping("/car")
    public String saleConfirm(@Valid CarForSaleBindingModel carForSaleBindingModel, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("carForSaleBindingModel", carForSaleBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.carForSaleBindingModel", bindingResult);
            return "redirect:/car/sale";
        }
        this.carSaleService.addMyCarForSale(this.modelMapper.map(carForSaleBindingModel, CarSaleServiceModel.class));
        return "redirect:/sale/details";

    }
    @GetMapping("/details")
    public ModelAndView detailsSale(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("saleDetails", this.carSaleService.findAll());

        modelAndView.setViewName("salecar-details");
        return modelAndView;
    }




}
