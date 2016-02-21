package br.com.sisteal.service;

import br.com.sisteal.entity.User;
import br.com.sisteal.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nataniel Paiva
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public  List<User> list(){
        return (List<User>) userRepository.findAll();
    }
    
    public User save(User user){
        return userRepository.save(user);
    }

    public User get(int id) {
        return userRepository.findOneUserr(id);
    }
}
