package project.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import project.models.entity.Contact;
import project.models.service.ContactServiceModel;
import project.repository.ContactUsRepository;
import project.service.ContactService;
import project.service.UserService;

@Service
public class ContactServiceImpl implements ContactService {
    private final ModelMapper modelMapper;
    private final ContactUsRepository contactUsRepository;
    private final UserService userService;

    public ContactServiceImpl(ModelMapper modelMapper, ContactUsRepository contactUsRepository, UserService userService) {
        this.modelMapper = modelMapper;
        this.contactUsRepository = contactUsRepository;
        this.userService = userService;
    }

    @Override
    public void addQuestion(ContactServiceModel contactServiceModel) {
        Contact contact = this.modelMapper.map(contactServiceModel, Contact.class);


        String username = userService.getUsername();
        contact.setUser(this.userService.findByUserName(username));

        this.contactUsRepository.save(contact);
    }
}
