package project.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import project.repository.ContactUsRepository;
import project.service.impl.ContactServiceImpl;

public class ContactUsServiceTest {

    @InjectMocks
    ContactServiceImpl contactService;

    @Mock
    ContactUsRepository contactUsRepository;

    @BeforeEach
    public void init(){
        MockitoAnnotations.initMocks(this);
    }


}
