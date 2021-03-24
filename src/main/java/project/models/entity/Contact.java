package project.models.entity;

import project.models.entity.enums.CityNameEnum;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact extends BaseEntity {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private CityNameEnum cities;
    private String subject;
    private UserEntity user;

    public Contact() {
    }

    public String getFirstName() {
        return firstName;
    }

    public Contact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public CityNameEnum getCities() {
        return cities;
    }

    public Contact setCities(CityNameEnum cities) {
        this.cities = cities;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Contact setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @ManyToOne
    public UserEntity getUser() {
        return user;
    }

    public Contact setUser(UserEntity user) {
        this.user = user;
        return this;
    }
}
