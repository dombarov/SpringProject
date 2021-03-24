package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.models.entity.Contact;

@Repository
public interface ContactUsRepository extends JpaRepository<Contact, String> {
}
