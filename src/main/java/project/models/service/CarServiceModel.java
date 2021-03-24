package project.models.service;

import java.math.BigDecimal;

public class CarServiceModel extends BaseServiceModel {

    private String id;
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


    public CarServiceModel() {
    }

    public String getCriteria() {
        return criteria;
    }

    public CarServiceModel setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }

    public String getId() {
        return id;
    }


    public CarServiceModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public CarServiceModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarServiceModel setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public CarServiceModel setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CarServiceModel setCategory(String category) {
        this.category = category;
        return this;
    }

    public int getYear() {
        return year;
    }

    public CarServiceModel setYear(int year) {
        this.year = year;
        return this;
    }

    public int getEuroStandard() {
        return euroStandard;
    }

    public CarServiceModel setEuroStandard(int euroStandard) {
        this.euroStandard = euroStandard;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public CarServiceModel setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public CarServiceModel setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public BigDecimal getGetPricePerDay() {
        return getPricePerDay;
    }

    public CarServiceModel setGetPricePerDay(BigDecimal getPricePerDay) {
        this.getPricePerDay = getPricePerDay;
        return this;
    }
}
