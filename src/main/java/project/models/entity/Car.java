package project.models.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "cars")
public class Car extends BaseEntity {

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



    public Car() {
    }

    public Car(String imageUrl,String criteria, String brand, int horsePower, String category, int year, int euroStandard, int seats, int fuelConsumption, Price price) {
        this.imageUrl = imageUrl;
        this.brand = brand;
        this.horsePower = horsePower;
        this.category = category;
        this.year = year;
        this.euroStandard = euroStandard;
        this.seats = seats;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.criteria = criteria;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Car setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Car setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Car setCategory(String category) {
        this.category = category;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public int getEuroStandard() {
        return euroStandard;
    }

    public Car setEuroStandard(int euroStandard) {
        this.euroStandard = euroStandard;
        return this;
    }

    public int getSeats() {
        return seats;
    }

    public Car setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public Car setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Price getPrice() {
        return price;
    }

    public Car setPrice(Price price) {
        this.price = price;
        return this;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public Car setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public String getCriteria() {
        return criteria;
    }

    public Car setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }


}

