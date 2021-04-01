package project.web;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import project.models.entity.Reservation;
import project.models.entity.UserEntity;
import project.repository.ReservationRepository;
import project.repository.RoleRepository;
import project.repository.UserRepository;

import java.time.Instant;
import java.time.LocalDate;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class ReservationControllerTest {

    private Reservation reservation;
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    MockMvc mockMvc;

    @BeforeEach
    public void init() {
//        this.reservation = new Reservation() {
//            {
//                setPickUpdate(LocalDate.now());
//                setPickUpLocation("Sofia");
//                setReturnDate(LocalDate.now());
//                setReturnLocation("Plovdiv");
//                setAdditionalExtras("Baby bag");
//            }
//        };
//        reservationRepository = Mockito.mock(ReservationRepository.class);
    }

    @AfterEach
    public void clear(){
        reservationRepository.deleteAll();
        userRepository.deleteAll();
        roleRepository.deleteAll();
    }

    @Test
    public void reservation_should_return_valid_status() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/reservation/add"))
                .andExpect(status().isOk())
                .andExpect(view().name("add-reservation"));

    }

//    @Test
//    @WithMockUser(username = "sashko_abv.bg", roles = {"USER", "ADMIN"})
//    void testCarsale() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.post("/reservation/add")
//                .param("pickUpdate", )
//        )
//    }


}