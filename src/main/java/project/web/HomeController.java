package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import project.service.CarService;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    private final CarService carService;

    public HomeController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    public String index(HttpSession httpSession, ModelAndView modelAndView){

        modelAndView.addObject("cars", carService.findAllItems());

        return "home";
    }
    @GetMapping("/home")
    public String getHome(){
        return "home";
    }

}
