package project.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import project.service.CarRentService;
import project.service.UserService;


@Component
public class DBInit implements CommandLineRunner {
    private final UserService userService;
    private final CarRentService carRentService;

    public DBInit(UserService userService, CarRentService carRentService) {
        this.userService = userService;

        this.carRentService = carRentService;
    }

    @Override
    public void run(String... args) throws Exception {

  userService.initUsers();
  carRentService.initCars();
    }
}
