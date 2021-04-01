package project.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import project.models.entity.UserEntity;
import project.models.entity.enums.UserRole;
import project.repository.UserRepository;
import project.service.UserService;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.logout;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    private UserEntity testUser;
    private UserRepository mockedUserRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private MockMvc mockMvc;


    @BeforeEach
    public void init() {
//        this.testUser = new UserEntity() {
//            {
//                setUsername("Pesho");
//                setPassword("123");
//                setEmail("sas@abv.bg");
//                setRoles(getRoles());
//            }
//        };
//        this.mockedUserRepository = Mockito.mock(UserRepository.class);

    }

    @Test
    public void getUserWithCorrectUsername_ShouldReturnCorrect() {
        Mockito.when(this.mockedUserRepository.findByUsername("Pesho"))
                .thenReturn(java.util.Optional.ofNullable(this.testUser));
    }

    @Test
    public void login_should_return_valid_status() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/users/login"))
                .andExpect(status().isOk())
                .andExpect(view().name("login"));

    }

    @Test
    public void login_should_return_invalid_status() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/users/login/434343"))
                .andExpect(status().isNotFound());
    }


    @Test
    public void register_should_return_valid_status() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/users/register"))
                .andExpect(status().isOk())
                .andExpect(view().name("register"))
                .andExpect(model().attributeExists("userRegisterBindingModel"));

    }

    @Test
    public void register_should_return_invalid_status() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/users/register/434343"))
                .andExpect(status().isNotFound());
    }


    @Test
    public void register_return_valid_user() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.post("/users/register")
                .param("username", "Pesho")
                .param("email", "sas@abv.bg")
                .param("password", "123")
                .param("confirmPassword", "123")
                .with(csrf())).andExpect(status().is3xxRedirection())
                .andExpect(mvcResult -> {
                    "/users/login".equals(mvcResult.getModelAndView().getViewName());
                });

    }

    @Test
    public void login_should_return_valid_param() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/users/login")
                .param("username", "admin@abv.bg")
                .param("password", "topsecret")
                .with(csrf())).andExpect(status().is2xxSuccessful());
    }


    @Test
    public void testPostUserRegisterPage() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                .post("/users/register")
                .param("username", "TestName")
                .param("email", "test@mail.bg")
                .param("password", "123123Test@")
                .param("confirmPassword", "123123Test@")
                .with(csrf()))
                .andExpect(status().is3xxRedirection())
                .andExpect(mvcResult -> {
                    assertEquals("redirect:login", Objects.requireNonNull(mvcResult.getModelAndView()).getViewName());
                });
    }

    @Test
    void logouTest() throws Exception {
        mockMvc.perform(logout());
    }













    @Test
    @WithMockUser(username = "sasho", authorities = {"USER"})
    public void givenManagerUser_whenGetFooSalute_thenOk() throws Exception {

        mockMvc.perform(get("/users/add"))
                .andExpect(status().is4xxClientError());

    }

    ;
}


//    @Test
//    public  void test_logout () throws Exception {
//
//
//    }




