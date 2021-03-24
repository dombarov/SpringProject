package project.view;

import project.models.entity.Price;

import java.math.BigDecimal;

public class CarForBuyViewModel {
    private String id;
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

    public CarForBuyViewModel() {
    }

    public String getId() {
        return id;
    }

    public CarForBuyViewModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public CarForBuyViewModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public CarForBuyViewModel setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public CarForBuyViewModel setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CarForBuyViewModel setCategory(String category) {
        this.category = category;
        return this;
    }

    public int getYear() {
        return year;
    }

    public CarForBuyViewModel setYear(int year) {
        this.year = year;
        return this;
    }

    public int getEuroStandard() {
        return euroStandard;
    }

    public CarForBuyViewModel setEuroStandard(int euroStandard) {
        this.euroStandard = euroStandard;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public CarForBuyViewModel setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public CarForBuyViewModel setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public CarForBuyViewModel setPrice(Price price) {
        this.price = price;
        return this;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public CarForBuyViewModel setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }
}
