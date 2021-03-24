package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.models.entity.CarForSale;

@Repository
public interface CarForSaleRepository extends JpaRepository<CarForSale, String> {
}
