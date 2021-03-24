package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import project.service.TransferService;

@Controller
@RequestMapping("transfers")
public class TransferController {
    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @GetMapping("list")
    public ModelAndView listtransfers(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("transfers", this.transferService.findAll());
        modelAndView.setViewName("transfers");

        return modelAndView;
    }

}
