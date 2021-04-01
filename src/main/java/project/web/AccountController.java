package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import project.service.CarService;
import project.service.ReservationService;

@Controller
@RequestMapping("/my")
public class AccountController {
    private final CarService carService;
    private final ReservationService reservationService;

    public AccountController(CarService carService, ReservationService reservationService) {
        this.carService = carService;
        this.reservationService = reservationService;
    }



    @GetMapping("/account")
    public ModelAndView getCarBut(@RequestParam("id") String id, ModelAndView modelAndView) {


        modelAndView.addObject("carforBuy", this.carService.findById(id));

        modelAndView.setViewName("account");
        return modelAndView;

    }


    @GetMapping("/buy/{id}")
    public String buyById(@PathVariable String id) {

        carService.buyById(id);


        return "redirect:/";
    }
}
