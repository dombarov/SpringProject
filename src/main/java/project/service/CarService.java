package project.service;

import project.models.entity.Car;
import project.view.CarForBuyViewModel;
import project.view.CarViewModel;

import java.math.BigDecimal;
import java.util.List;

public interface CarService {
    void initCarSpecific();

    List<CarViewModel> findAllItems();


    BigDecimal getTotalSum();

    List<CarForBuyViewModel> findAllCarSport();

    CarForBuyViewModel findById(String id);

    void buyById(String id);

    List<CarForBuyViewModel> findAllCarEconomy();

    List<CarForBuyViewModel> findAllCarTravell();


    void deleteById(String id);
}
