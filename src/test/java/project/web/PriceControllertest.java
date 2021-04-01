package project.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import project.models.entity.Price;
import project.repository.PriceRepository;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllertest {

    private PriceRepository priceRepository;
    private Price price;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void price_should_return_valid_status() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/price/list"))
                .andExpect(status().isOk())
                .andExpect(view().name("prices"));

    }

}
