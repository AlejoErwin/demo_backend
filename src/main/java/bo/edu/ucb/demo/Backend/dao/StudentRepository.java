package bo.edu.ucb.demo.Backend.dao;

import bo.edu.ucb.demo.Backend.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Contact, Integer> {
    
}
