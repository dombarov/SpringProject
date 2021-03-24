package project.models.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "transfers")
public class Transfers extends BaseEntity {

    private String route;
    private BigDecimal carWith5seats;
    private BigDecimal minivanWith7seats;
    private BigDecimal minibusWith9seats;

    public Transfers() {
    }

    public String getRoute() {
        return route;
    }

    public Transfers setRoute(String route) {
        this.route = route;
        return this;
    }

    public BigDecimal getCarWith5seats() {
        return carWith5seats;
    }

    public Transfers setCarWith5seats(BigDecimal carWith5seats) {
        this.carWith5seats = carWith5seats;
        return this;
    }

    public BigDecimal getMinivanWith7seats() {
        return minivanWith7seats;
    }

    public Transfers setMinivanWith7seats(BigDecimal minivanWith7seats) {
        this.minivanWith7seats = minivanWith7seats;
        return this;
    }

    public BigDecimal getMinibusWith9seats() {
        return minibusWith9seats;
    }

    public Transfers setMinibusWith9seats(BigDecimal minibusWith9seats) {
        this.minibusWith9seats = minibusWith9seats;
        return this;
    }
}
