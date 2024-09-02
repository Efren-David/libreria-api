package com.edgv.library_api_sec.Repository;


import com.edgv.library_api_sec.Entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(String name);
}
