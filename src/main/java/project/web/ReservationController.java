package project.web;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.models.binding.ReservationAddBindingModel;
import project.models.service.ReservationAddServiceModel;
import project.service.ReservationService;

import javax.validation.Valid;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
    private final ModelMapper modelMapper;
    private final ReservationService reservationService;

    public ReservationController(ModelMapper modelMapper, ReservationService reservationService) {
        this.modelMapper = modelMapper;
        this.reservationService = reservationService;
    }

    @GetMapping("/add")
    public String viewReservation(Model model){
        if (!model.containsAttribute("reservationAddBindingModel")){
            model.addAttribute("reservationAddBindingModel", new ReservationAddBindingModel());
        }

        return "add-reservation";
    }

    @PostMapping("/add")
    public String reservationConfirm(@Valid ReservationAddBindingModel reservationAddBindingModel, BindingResult bindingResult,
                                     RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            System.out.println();
            redirectAttributes.addFlashAttribute("reservationAddBindingModel", reservationAddBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.reservationAddBindingModel", bindingResult);
            return "redirect:add-reservation";
        }
        System.out.println();
        this.reservationService.addReservation(this.modelMapper.map(reservationAddBindingModel, ReservationAddServiceModel.class));
        return "redirect:/view/cars";

    }


}
