package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.models.entity.Car;
import project.view.CarForBuyViewModel;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {

    @Query("select SUM(s.pricePerDay) from Car s")
    BigDecimal findTotalCarSum();



//    List<Car> findAll()
}
