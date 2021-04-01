package project.web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import project.repository.CarForSaleRepository;
import project.repository.RoleRepository;
import project.repository.UserRepository;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class SaleControllerTest {

    @Autowired
    private CarForSaleRepository carForSaleRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    MockMvc mockMvc;




    @Test
    public void contact_should_return_valid_status() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/sale/car"))
                .andExpect(status().isOk())
                .andExpect(view().name("sale-car"));

    }


    @Test
    @WithMockUser(username = "sashko_abv.bg", roles = {"USER", "ADMIN"})
    void testCarsale() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.post("/sale/car")
                .param("brand", "honda")
                .param("enginetype", "benzin")
                .param("horsePower", "140")
                .param("year", "2017")
                .param("price", "9000")
                .param("mileage", "240000")
                .param("colour", "grey")
                .param("transmission", "manual")
                .param("image", "honda")
                .param("telephoneNumber", "454353453")
                .with(csrf())).andExpect(status().is3xxRedirection());

        Assertions.assertEquals(1, carForSaleRepository.count());

    }


}
