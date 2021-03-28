package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import project.service.CarService;
import project.service.PriceService;

@Controller
@RequestMapping("price")
public class PriceController {
    private final PriceService priceService;
    private final CarService carService;

    public PriceController(PriceService priceService, CarService carService) {
        this.priceService = priceService;
        this.carService = carService;
    }

    @GetMapping("/list")
    public ModelAndView priceList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("car", this.carService.findAllCarEconomy());
        modelAndView.addObject("cars", this.carService.findAllCarSport());
        modelAndView.addObject("cart", this.carService.findAllCarTravell());
//        modelAndView.addObject("price", this.priceService.findAllPrices());
        modelAndView.setViewName("prices");

        return modelAndView;

    }

    @GetMapping("/delete/{id}")
    public String deletePrice(@PathVariable String id){

        carService.deleteById(id);
//        carService.findById(id);
//        carService.deleteById( id);
        return "redirect:/price/list";
    }

}
