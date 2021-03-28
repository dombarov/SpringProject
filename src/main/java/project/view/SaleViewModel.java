package project.view;

import project.models.entity.UserEntity;

public class SaleViewModel {
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
    private String telephoneNumber;

    public SaleViewModel() {
    }

    public String getBrand() {
        return brand;
    }

    public SaleViewModel setBrand(String brand) {
        this.brand = brand;
        return this;
    }


    public String getEnginetype() {
        return enginetype;
    }

    public SaleViewModel setEnginetype(String enginetype) {
        this.enginetype = enginetype;
        return this;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public SaleViewModel setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public int getYear() {
        return year;
    }

    public SaleViewModel setYear(int year) {
        this.year = year;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public SaleViewModel setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public SaleViewModel setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getColour() {
        return colour;
    }

    public SaleViewModel setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public String getTransmission() {
        return transmission;
    }

    public SaleViewModel setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public SaleViewModel setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public String getImage() {
        return image;
    }

    public SaleViewModel setImage(String image) {
        this.image = image;
        return this;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public SaleViewModel setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }
}
