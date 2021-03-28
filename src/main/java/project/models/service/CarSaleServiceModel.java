package project.models.service;

public class CarSaleServiceModel {

    private String brand;

    private String enginetype;
    private String horsePower;
    private String year;
    private int price;
    private String mileage;
    private String colour;
    private String transmission;
    private String image;
    private String telephoneNumber;


    public CarSaleServiceModel() {
    }

    public String getBrand() {
        return brand;
    }

    public CarSaleServiceModel setBrand(String brand) {
        this.brand = brand;
        return this;
    }



    public String getEnginetype() {
        return enginetype;
    }

    public CarSaleServiceModel setEnginetype(String enginetype) {
        this.enginetype = enginetype;
        return this;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public CarSaleServiceModel setHorsePower(String horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public String getYear() {
        return year;
    }

    public CarSaleServiceModel setYear(String year) {
        this.year = year;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public CarSaleServiceModel setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getMileage() {
        return mileage;
    }

    public CarSaleServiceModel setMileage(String mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getColour() {
        return colour;
    }

    public CarSaleServiceModel setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public String getTransmission() {
        return transmission;
    }

    public CarSaleServiceModel setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public String getImage() {
        return image;
    }

    public CarSaleServiceModel setImage(String image) {
        this.image = image;
        return this;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public CarSaleServiceModel setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }
}
