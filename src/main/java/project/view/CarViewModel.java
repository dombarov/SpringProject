package project.view;

import project.models.entity.Price;

import java.math.BigDecimal;

public class CarViewModel {

    private String imageUrl;
    private String brand;
    private int horsePower;
    private String category;
    private int year;
    private int euroStandard;
    private int seats;
    private int fuelConsumption;
    private Price price;
    private BigDecimal pricePerDay;
    private String criteria;


    public CarViewModel() {
    }

    public Price getPrice() {
        return price;
    }

    public CarViewModel setPrice(Price price) {
        this.price = price;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public CarViewModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarViewModel setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public CarViewModel setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CarViewModel setCategory(String category) {
        this.category = category;
        return this;
    }

    public int getYear() {
        return year;
    }

    public CarViewModel setYear(int year) {
        this.year = year;
        return this;
    }

    public int getEuroStandard() {
        return euroStandard;
    }

    public CarViewModel setEuroStandard(int euroStandard) {
        this.euroStandard = euroStandard;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public CarViewModel setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public CarViewModel setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public CarViewModel setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public String getCriteria() {
        return criteria;
    }

    public CarViewModel setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
}
