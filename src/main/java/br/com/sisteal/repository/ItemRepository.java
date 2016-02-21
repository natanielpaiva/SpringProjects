package br.com.sisteal.repository;

import br.com.sisteal.entity.Item;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nataniel Paiva
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Serializable> {

}
