package com.edgv.library_api_sec.Service;


import com.edgv.library_api_sec.Entity.User;

import java.util.Set;

public interface UserService {

    Set<User> findAll();
    User findByUsername(String username);
    Set<User> findByCity(String city);

    User addUser(String user);
    void remove(User user);

}
