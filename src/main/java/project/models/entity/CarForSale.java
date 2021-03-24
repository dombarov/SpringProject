package project.models.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cars_sale")
public class CarForSale extends BaseEntity {

    private String brand;
    private String enginetype;
    private int horsePower;
    private int year;
    private int price;
    private int mileage;
    private String colour;
    private String transmission;
    private UserEntity user;
    private String image;

    public CarForSale() {
    }

    @ManyToOne
    public UserEntity getUser() {
        return user;
    }

    public CarForSale setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarForSale setBrand(String brand) {
        this.brand = brand;
        return this;
    }


    public String getEnginetype() {
        return enginetype;
    }

    public CarForSale setEnginetype(String enginetype) {
        this.enginetype = enginetype;
        return this;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public CarForSale setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public int getYear() {
        return year;
    }

    public CarForSale setYear(int year) {
        this.year = year;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public CarForSale setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public CarForSale setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getColour() {
        return colour;
    }

    public CarForSale setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public String getTransmission() {
        return transmission;
    }

    public CarForSale setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public String getImage() {
        return image;
    }

    public CarForSale setImage(String image) {
        this.image = image;
        return this;
    }
}
