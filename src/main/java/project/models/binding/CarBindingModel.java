package project.models.binding;

import project.models.entity.Reservation;
import project.models.entity.UserEntity;

import java.math.BigDecimal;

public class CarBindingModel {

    private String imageUrl;
    private String brand;
    private int horsePower;
    private String category;
    private int year;
    private int euroStandard;
    private int seats;
    private int fuelConsumption;
    private BigDecimal getPricePerDay;
    private String criteria;



    public CarBindingModel() {
    }

    public String getCriteria() {
        return criteria;
    }

    public CarBindingModel setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public CarBindingModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarBindingModel setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public CarBindingModel setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CarBindingModel setCategory(String category) {
        this.category = category;
        return this;
    }

    public int getYear() {
        return year;
    }

    public CarBindingModel setYear(int year) {
        this.year = year;
        return this;
    }

    public int getEuroStandard() {
        return euroStandard;
    }

    public CarBindingModel setEuroStandard(int euroStandard) {
        this.euroStandard = euroStandard;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public CarBindingModel setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public CarBindingModel setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public BigDecimal getGetPricePerDay() {
        return getPricePerDay;
    }

    public CarBindingModel setGetPricePerDay(BigDecimal getPricePerDay) {
        this.getPricePerDay = getPricePerDay;
        return this;
    }


}
