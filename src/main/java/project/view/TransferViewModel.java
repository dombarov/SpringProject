package project.view;

import java.math.BigDecimal;

public class TransferViewModel {
    private String route;
    private BigDecimal carWith5seats;
    private BigDecimal minivanWith7seats;
    private BigDecimal minibusWith9seats;

    public TransferViewModel() {
    }

    public String getRoute() {
        return route;
    }

    public TransferViewModel setRoute(String route) {
        this.route = route;
        return this;
    }

    public BigDecimal getCarWith5seats() {
        return carWith5seats;
    }

    public TransferViewModel setCarWith5seats(BigDecimal carWith5seats) {
        this.carWith5seats = carWith5seats;
        return this;
    }

    public BigDecimal getMinivanWith7seats() {
        return minivanWith7seats;
    }

    public TransferViewModel setMinivanWith7seats(BigDecimal minivanWith7seats) {
        this.minivanWith7seats = minivanWith7seats;
        return this;
    }

    public BigDecimal getMinibusWith9seats() {
        return minibusWith9seats;
    }

    public TransferViewModel setMinibusWith9seats(BigDecimal minibusWith9seats) {
        this.minibusWith9seats = minibusWith9seats;
        return this;
    }
}
