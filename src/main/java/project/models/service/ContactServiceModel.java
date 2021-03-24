package project.models.service;

import project.models.entity.enums.CityNameEnum;

public class ContactServiceModel {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private CityNameEnum cities;
    private String subject;
    private UserServiceModel user;

    public ContactServiceModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public ContactServiceModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ContactServiceModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ContactServiceModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CityNameEnum getCities() {
        return cities;
    }

    public ContactServiceModel setCities(CityNameEnum cities) {
        this.cities = cities;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public ContactServiceModel setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public UserServiceModel getUser() {
        return user;
    }

    public ContactServiceModel setUser(UserServiceModel user) {
        this.user = user;
        return this;
    }
}
