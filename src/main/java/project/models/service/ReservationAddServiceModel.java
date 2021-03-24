package project.models.service;

import project.models.entity.UserEntity;

import java.time.LocalDate;

public class ReservationAddServiceModel {
    private LocalDate pickUpdate;
    private String pickUpLocation;
    private LocalDate returnDate;
    private String returnLocation;
    private String additionalExtras;
    private UserEntity user;
//    private CarRentServiceModel carModel;






    public ReservationAddServiceModel() {
    }

    public UserEntity getUser() {
        return user;
    }

    public ReservationAddServiceModel setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public LocalDate getPickUpdate() {
        return pickUpdate;
    }

    public ReservationAddServiceModel setPickUpdate(LocalDate pickUpdate) {
        this.pickUpdate = pickUpdate;
        return this;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public ReservationAddServiceModel setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
        return this;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public ReservationAddServiceModel setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public String getReturnLocation() {
        return returnLocation;
    }

    public ReservationAddServiceModel setReturnLocation(String returnLocation) {
        this.returnLocation = returnLocation;
        return this;
    }

    public String getAdditionalExtras() {
        return additionalExtras;
    }

    public ReservationAddServiceModel setAdditionalExtras(String additionalExtras) {
        this.additionalExtras = additionalExtras;
        return this;
    }

//    public CarRentServiceModel getCarModel() {
//        return carModel;
//    }
//
//    public ReservationAddServiceModel setCarModel(CarRentServiceModel carModel) {
//        this.carModel = carModel;
//        return this;
//    }
}
