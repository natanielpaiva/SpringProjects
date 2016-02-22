package br.com.sisteal.controller;

import br.com.sisteal.entity.User;
import br.com.sisteal.service.UserService;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> list() {
        return userService.list();
    }

    @RequestMapping(params = "/{id}", method = RequestMethod.GET)
    public User get(@RequestParam(value = "id") int id) {
        return userService.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User update(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody User user) {
        userService.delete(user);
    }

}
