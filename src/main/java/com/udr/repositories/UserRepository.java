package com.udr.repositories;

import com.udr.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by udr013 on 11-5-2016.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String name);
}
