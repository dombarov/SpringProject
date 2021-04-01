package project.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import project.models.entity.Car;
import project.models.entity.Price;
import project.repository.CarRepository;
import project.service.impl.CarServiceImpl;
import project.view.CarForBuyViewModel;
import project.view.CarViewModel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {
    private CarServiceImpl carService;

    @Mock
    ModelMapper modelMapper;

    @Mock
    CarRepository carRepository;

    @BeforeEach
    public void setUp(){

    }

//    @Test
//    void findById() {
//        Price price = new Price();
//        price.setPrice2_4Days(BigDecimal.valueOf(28));
//        price.setPrice5_7days(BigDecimal.valueOf(26));
//        price.setPrice8_14days(BigDecimal.valueOf(24));
//        price.setPrice15_29days(BigDecimal.valueOf(22));
//        price.setPrice30Moredays(BigDecimal.valueOf(19));
//        price.setDeposit(BigDecimal.valueOf(200));
//        price.setId("2121");
//
//
//        Car car = new Car();
//        car.setImageUrl("sgfsgsg")
//                . setBrand("Honda")
//        .setHorsePower(90)
//        .setCategory("van")
//        .setYear(2008)
//        .setEuroStandard(6)
//        .setSeats(5)
//        .setFuelConsumption(9)
//        .setPrice(car.getPrice())
//        .setPricePerDay(BigDecimal.valueOf(45))
//        .setCriteria("sport")
//                .setPrice(price);
//        car.setId("id");
//
//
//        System.out.println();
//        CarForBuyViewModel carForBuyViewModel = this.modelMapper.map(car, CarForBuyViewModel.class);
//
//        Mockito.when(carRepository.findById("id")).thenReturn(java.util.Optional.of(car));
//
//
//        CarForBuyViewModel byID = carService.findById("id");
//
//        Assertions.assertEquals(carForBuyViewModel.getBrand(), byID.getBrand());
//
//    }

//    @Test
//    void findAllcarEconomyTest(){
//                Price price1 = new Price();
//        price1.setPrice2_4Days(BigDecimal.valueOf(2));
//        price1.setPrice5_7days(BigDecimal.valueOf(226));
//        price1.setPrice8_14days(BigDecimal.valueOf(224));
//        price1.setPrice15_29days(BigDecimal.valueOf(222));
//        price1.setPrice30Moredays(BigDecimal.valueOf(129));
//        price1.setDeposit(BigDecimal.valueOf(2020));
//        price1.setId("21212");
//
//
//        Car car1 = new Car();
//        car1.setImageUrl("22фвф")
//                . setBrand("22Honda")
//        .setHorsePower(902)
//        .setCategory("vaввn")
//        .setYear(20082)
//        .setEuroStandard(26)
//        .setSeats(52)
//        .setFuelConsumption(29)
//        .setPrice(car1.getPrice())
//        .setPricePerDay(BigDecimal.valueOf(425))
//        .setCriteria("economy")
//                .setPrice(price1);
//        car1.setId("id2");
//
//        Price price2 = new Price();
//        price2.setPrice2_4Days(BigDecimal.valueOf(28));
//        price2.setPrice5_7days(BigDecimal.valueOf(26));
//        price2.setPrice8_14days(BigDecimal.valueOf(24));
//        price2.setPrice15_29days(BigDecimal.valueOf(22));
//        price2.setPrice30Moredays(BigDecimal.valueOf(19));
//        price2.setDeposit(BigDecimal.valueOf(200));
//        price2.setId("2121");
//
//        Car car2 = new Car();
//        car2.setImageUrl("sgfsgsg")
//                . setBrand("Honda")
//                .setHorsePower(90)
//                .setCategory("van")
//                .setYear(2008)
//                .setEuroStandard(6)
//                .setSeats(5)
//                .setFuelConsumption(9)
//                .setPrice(car2.getPrice())
//                .setPricePerDay(BigDecimal.valueOf(45))
//                .setCriteria("economy")
//                .setPrice(price2);
//        car2.setId("id");
//
//        List<CarViewModel> carForBuyViewModels = new ArrayList<>();
//        carForBuyViewModels.add(this.modelMapper.map(car1, CarViewModel.class));
//        carForBuyViewModels.add(this.modelMapper.map(car2, CarViewModel.class));
//
//        Mockito.when(carRepository.findAll()).thenReturn(List.of(car1, car2));
//        System.out.println();
//        List<CarForBuyViewModel> all = carService.findAllCarEconomy();
//        Assertions.assertEquals(2, all.size());
//
//        System.out.println();
//    }
}
