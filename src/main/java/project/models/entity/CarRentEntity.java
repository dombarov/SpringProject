package project.models.entity;

import project.models.entity.enums.CarModelEnum;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "car_rental")
public class CarRentEntity extends BaseEntity {

    private CarModelEnum model;
    private String description;

    public CarRentEntity() {
    }



    public CarRentEntity(CarModelEnum model, String description) {
        this.model = model;
        this.description = description;

    }


    @Enumerated
    public CarModelEnum getModel() {
        return model;
    }

    public CarRentEntity setModel(CarModelEnum model) {
        this.model = model;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CarRentEntity setDescription(String description) {
        this.description = description;
        return this;
    }
}
