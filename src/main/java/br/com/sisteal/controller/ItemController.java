package br.com.sisteal.controller;

import br.com.sisteal.entity.Item;
import br.com.sisteal.service.ItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nataniel Paiva
 */
@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Item> list() {
        return itemService.list();
    }
    
    @RequestMapping(params = "/{id}" ,method = RequestMethod.GET)
    public Item get(@RequestParam(value="id") int id){
        return itemService.get(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public Item save(@RequestBody Item item) {
        return itemService.save(item);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Item update(@RequestBody Item item) {
        return itemService.save(item);
    }

}
