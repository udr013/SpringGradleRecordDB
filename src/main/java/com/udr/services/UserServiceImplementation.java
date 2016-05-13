package com.udr.services;

import com.udr.models.User;
import com.udr.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by udr013 on 11-5-2016.
 */
@Service
@Transactional
public class UserServiceImplementation implements UserServiceInterface {

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    protected UserRepository userRepository;
    @Override
    public User saveUser(User user) {
         return userRepository.save(user);
    }

    @Override
    public Boolean deleteUser(Integer id) {
        User temp = userRepository.findOne(id);
       if(temp!=null){
           userRepository.delete(id);
           return true;
       }
        return false;
    }

    @Override
    public User editUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUser(Integer id) {
        return userRepository.findOne(id);
    }

    @Override
    public Collection<User> getAllUsers() {
        return (Collection<User>) userRepository.findAll();
    }
//
//    @Override
//    public Collection<User> findByName(String name) {
//        return (Collection<User>) userRepository.findByName(name);
//    }
}
