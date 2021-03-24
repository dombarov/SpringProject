package project.models.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
public class Reservation extends BaseEntity{

    private LocalDate pickUpdate;
    private String pickUpLocation;
    private LocalDate returnDate;
    private String returnLocation;
    private String additionalExtras;
    private UserEntity user;
//    private CarRentEntity carModel;

    @ManyToOne
    public UserEntity getUser() {
        return user;
    }

    public Reservation setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public Reservation() {
    }

    @Column
    public LocalDate getPickUpdate() {
        return pickUpdate;
    }

    public Reservation setPickUpdate(LocalDate pickUpdate) {
        this.pickUpdate = pickUpdate;
        return this;
    }

    @Column(nullable = false)
    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public Reservation setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
        return this;
    }

    @Column
    public LocalDate getReturnDate() {
        return returnDate;
    }

    public Reservation setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    @Column(nullable = false)
    public String getReturnLocation() {
        return returnLocation;
    }

    public Reservation setReturnLocation(String returnLocation) {
        this.returnLocation = returnLocation;
        return this;
    }

    @Column
    public String getAdditionalExtras() {
        return additionalExtras;
    }

    public Reservation setAdditionalExtras(String additionalExtras) {
        this.additionalExtras = additionalExtras;
        return this;
    }

//    @ManyToOne
//    public CarRentEntity getCarModel() {
//        return carModel;
//    }
//
//
//    public Reservation setCarModel(CarRentEntity carModel) {
//        this.carModel = carModel;
//        return this;
//    }
}
