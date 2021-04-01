package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.models.entity.CarForSale;
import project.models.entity.Reservation;

import java.time.LocalDate;

@Repository
public interface CarForSaleRepository extends JpaRepository<CarForSale, String> {


}
