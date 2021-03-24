package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.models.entity.CarRentEntity;
import project.models.entity.enums.CarModelEnum;

import java.util.Optional;

@Repository
public interface CarRentRepository extends JpaRepository<CarRentEntity, String> {

    Optional<CarRentEntity> findByModel(CarModelEnum carModelEnum);
}
