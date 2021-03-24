package project.models.service;

import project.models.entity.enums.CarModelEnum;

public class CarRentServiceModel {

   private CarModelEnum carModel;
   private String description;

    public CarRentServiceModel() {
    }

    public CarModelEnum getCarModel() {
        return carModel;
    }

    public CarRentServiceModel setCarModel(CarModelEnum carModel) {
        this.carModel = carModel;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CarRentServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
