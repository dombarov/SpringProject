package project.models.binding;

import project.models.entity.enums.CityNameEnum;

public class ContactBindingModel {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private CityNameEnum cities;
    private String subject;


    public ContactBindingModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public ContactBindingModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ContactBindingModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ContactBindingModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CityNameEnum getCities() {
        return cities;
    }

    public ContactBindingModel setCities(CityNameEnum cities) {
        this.cities = cities;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public ContactBindingModel setSubject(String subject) {
        this.subject = subject;
        return this;
    }
}
