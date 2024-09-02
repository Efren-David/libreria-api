package com.edgv.library_api_sec.Service;

import com.edgv.library_api_sec.Entity.User;
import com.edgv.library_api_sec.Repository.RoleRepository;
import com.edgv.library_api_sec.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public Set<User> findAll() {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Set<User> findByCity(String city) {
        return null;
    }

    @Override
    public User addUser(String user) {
        return null;
    }

    @Override
    public void remove(User user) {
        userRepository.delete(user);
    }
}
