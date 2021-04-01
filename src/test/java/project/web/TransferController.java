package project.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class TransferController {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void transfers_should_return_valid_status() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/transfers/list"))
                .andExpect(status().isOk())
        ;

    }
}
