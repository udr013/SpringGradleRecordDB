package com.udr.record.repositories;

import org.springframework.data.repository.CrudRepository;

import com.udr.record.domain.User;

/**
 * Created by udr013 on 11-5-2016.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String name);
    User findByEmail (String email);
}
