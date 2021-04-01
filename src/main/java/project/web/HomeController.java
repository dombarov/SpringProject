package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import project.service.CarService;
import project.service.CarouselService;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    private final CarService carService;
    private final CarouselService carouselService;

    public HomeController(CarService carService, CarouselService carouselService) {
        this.carService = carService;
        this.carouselService = carouselService;
    }

//    @GetMapping("/")
//    public String index(HttpSession httpSession, ModelAndView modelAndView){
//
//        modelAndView.addObject("cars", carService.findAllItems());
//
//        return "home";
//    }
    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("firstImg", carouselService.firstImage());
        model.addAttribute("secondImg", carouselService.secondImage());
        model.addAttribute("thirdImg", carouselService.thirdImage());
        System.out.println();
        return "home";
    }

}
