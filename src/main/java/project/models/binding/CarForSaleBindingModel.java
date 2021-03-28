package project.models.binding;

public class CarForSaleBindingModel {
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


    public CarForSaleBindingModel() {
    }

    public String getBrand() {
        return brand;
    }

    public CarForSaleBindingModel setBrand(String brand) {
        this.brand = brand;
        return this;
    }



    public String getEnginetype() {
        return enginetype;
    }

    public CarForSaleBindingModel setEnginetype(String enginetype) {
        this.enginetype = enginetype;
        return this;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public CarForSaleBindingModel setHorsePower(String horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public String getYear() {
        return year;
    }

    public CarForSaleBindingModel setYear(String year) {
        this.year = year;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public CarForSaleBindingModel setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getMileage() {
        return mileage;
    }

    public CarForSaleBindingModel setMileage(String mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getColour() {
        return colour;
    }

    public CarForSaleBindingModel setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public String getTransmission() {
        return transmission;
    }

    public CarForSaleBindingModel setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public String getImage() {
        return image;
    }

    public CarForSaleBindingModel setImage(String image) {
        this.image = image;
        return this;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public CarForSaleBindingModel setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }
}
