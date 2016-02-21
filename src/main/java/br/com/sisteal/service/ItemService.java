package br.com.sisteal.service;

import br.com.sisteal.entity.Item;
import br.com.sisteal.repository.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nataniel Paiva
 */
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;
    
    public List<Item> list(){
        return itemRepository.findAll();
    }
    
    public Item get(int id){
        return itemRepository.findOne(id);
    }
    
    public Item save(Item item){
        return itemRepository.save(item);
    }
}
