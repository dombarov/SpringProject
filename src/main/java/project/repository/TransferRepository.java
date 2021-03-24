package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.models.entity.Transfers;

@Repository
public interface TransferRepository extends JpaRepository<Transfers, String> {
}
