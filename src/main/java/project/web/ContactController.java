package project.web;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import project.models.binding.ContactBindingModel;
import project.models.service.ContactServiceModel;
import project.service.ContactService;

import javax.validation.Valid;

@Controller
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;
    private final ModelMapper modelMapper;

    public ContactController(ContactService contactService, ModelMapper modelMapper) {
        this.contactService = contactService;
        this.modelMapper = modelMapper;
    }


    @GetMapping("/view")
    public String aboutUs(Model model){
        if (!model.containsAttribute("contactBindingModel")){
            model.addAttribute("contactBindingModel", new ContactBindingModel());
        }
        return "about-us";
    }

    @PostMapping("/view")
    public String contactConfirm(@Valid ContactBindingModel contactBindingModel, RedirectAttributes redirectAttributes, BindingResult bindingResult){
        System.out.println();
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("contactBindingModel", contactBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.contactBindingModel", bindingResult);
            return "redirect:about-us";
        }


        this.contactService.addQuestion(this.modelMapper.map(contactBindingModel, ContactServiceModel.class));

        return "redirect:/";



    }
}
