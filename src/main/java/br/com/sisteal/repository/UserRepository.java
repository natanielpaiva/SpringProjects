package br.com.sisteal.repository;

import br.com.sisteal.entity.User;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nataniel Paiva
 */
@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{
    
}
