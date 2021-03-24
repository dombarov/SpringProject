package project.models.binding;

import org.springframework.format.annotation.DateTimeFormat;
import project.models.entity.enums.CarModelEnum;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ReservationAddBindingModel {
    private LocalDate pickUpdate;
    private String pickUpLocation;
    private LocalDate returnDate;
    private String returnLocation;
    private String additionalExtras;
//    private CarModelEnum carModel;

    public ReservationAddBindingModel() {
    }

    @FutureOrPresent(message = "Enter valid date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate getPickUpdate() {
        return pickUpdate;
    }

    public ReservationAddBindingModel setPickUpdate(LocalDate pickUpdate) {
        this.pickUpdate = pickUpdate;
        return this;
    }

    @NotBlank(message = "Enter valid adress")
    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public ReservationAddBindingModel setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
        return this;
    }

    @FutureOrPresent(message = "Enter valid date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public ReservationAddBindingModel setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    @NotBlank(message = "Enter valid adress")
    public String getReturnLocation() {
        return returnLocation;
    }

    public ReservationAddBindingModel setReturnLocation(String returnLocation) {
        this.returnLocation = returnLocation;
        return this;
    }

    public String getAdditionalExtras() {
        return additionalExtras;
    }

    public ReservationAddBindingModel setAdditionalExtras(String additionalExtras) {
        this.additionalExtras = additionalExtras;
        return this;
    }
//
//    public CarModelEnum getCarModel() {
//        return carModel;
//    }
//
//    public ReservationAddBindingModel setCarModel(CarModelEnum carModel) {
//        this.carModel = carModel;
//        return this;
//    }
}
