package com.edgv.library_api_sec.Repository;

import com.edgv.library_api_sec.Entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
    User findByUsername(String username);
    Set<User> findByCity(String city);
    Set<User> findByPostalCode(String postalCode);
}
