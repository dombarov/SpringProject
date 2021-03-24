package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.models.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
//    @Query("select p.pickUpdate, p.returnDate from Reservation  p where SUM(p.returnDate - p.pickUpdate)")
//    Integer findAllTimeToRent();
}
