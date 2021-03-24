package project.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.service.CarService;

@Controller
@RequestMapping("view")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

//    @GetMapping("/cars")
//    public String cars() {
//        return "cars";
//    }

    @GetMapping("/cars")
    public ModelAndView details() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("car", this.carService.findAllCarSport());
        modelAndView.addObject("carEcon", this.carService.findAllCarEconomy());
        modelAndView.addObject("carTravel", this.carService.findAllCarTravell());
        modelAndView.setViewName("cars");
        return modelAndView;

    }








}


