package project.view;

import project.models.entity.Car;

import java.math.BigDecimal;

public class PriceViewModel {
    private Car car;
    private BigDecimal price2_4Days;
    private BigDecimal price5_7days;
    private BigDecimal price8_14days;
    private BigDecimal price15_29days;
    private BigDecimal price30Moredays;
    private BigDecimal deposit;

    public PriceViewModel() {
    }

    public Car getCar() {
        return car;
    }

    public PriceViewModel setCar(Car car) {
        this.car = car;
        return this;
    }

    public BigDecimal getPrice2_4Days() {
        return price2_4Days;
    }

    public PriceViewModel setPrice2_4Days(BigDecimal price2_4Days) {
        this.price2_4Days = price2_4Days;
        return this;
    }

    public BigDecimal getPrice5_7days() {
        return price5_7days;
    }

    public PriceViewModel setPrice5_7days(BigDecimal price5_7days) {
        this.price5_7days = price5_7days;
        return this;
    }

    public BigDecimal getPrice8_14days() {
        return price8_14days;
    }

    public PriceViewModel setPrice8_14days(BigDecimal price8_14days) {
        this.price8_14days = price8_14days;
        return this;
    }

    public BigDecimal getPrice15_29days() {
        return price15_29days;
    }

    public PriceViewModel setPrice15_29days(BigDecimal price15_29days) {
        this.price15_29days = price15_29days;
        return this;
    }

    public BigDecimal getPrice30Moredays() {
        return price30Moredays;
    }

    public PriceViewModel setPrice30Moredays(BigDecimal price30Moredays) {
        this.price30Moredays = price30Moredays;
        return this;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public PriceViewModel setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }
}
