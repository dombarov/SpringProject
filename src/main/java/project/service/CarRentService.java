package project.service;

import project.models.entity.CarRentEntity;
import project.models.entity.enums.CarModelEnum;

public interface CarRentService {

    void initCars();
    CarRentEntity findByModel(CarModelEnum carModelEnum);
}
