package project.models.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "prices")
public class Price extends BaseEntity{

    private BigDecimal price2_4Days;
    private BigDecimal price5_7days;
    private BigDecimal price8_14days;
    private BigDecimal price15_29days;
    private BigDecimal price30Moredays;
    private BigDecimal deposit;
    private Car car;

    public Price() {
    }

    @ManyToOne
    public Car getCar() {
        return car;
    }

    public Price setCar(Car car) {
        this.car = car;
        return this;
    }

    public BigDecimal getPrice2_4Days() {
        return price2_4Days;
    }

    public Price setPrice2_4Days(BigDecimal price2_4Days) {
        this.price2_4Days = price2_4Days;
        return this;
    }

    public BigDecimal getPrice5_7days() {
        return price5_7days;
    }

    public Price setPrice5_7days(BigDecimal price5_7days) {
        this.price5_7days = price5_7days;
        return this;
    }

    public BigDecimal getPrice8_14days() {
        return price8_14days;
    }

    public Price setPrice8_14days(BigDecimal price8_14days) {
        this.price8_14days = price8_14days;
        return this;
    }

    public BigDecimal getPrice15_29days() {
        return price15_29days;
    }

    public Price setPrice15_29days(BigDecimal price15_29days) {
        this.price15_29days = price15_29days;
        return this;
    }

    public BigDecimal getPrice30Moredays() {
        return price30Moredays;
    }

    public Price setPrice30Moredays(BigDecimal price30Moredays) {
        this.price30Moredays = price30Moredays;
        return this;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public Price setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }
}
