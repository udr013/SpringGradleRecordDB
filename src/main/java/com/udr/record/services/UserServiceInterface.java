package com.udr.record.services;

import java.util.Collection;

import com.udr.record.domain.User;

public interface UserServiceInterface {

    public User saveUser(User user);
    public Boolean deleteUser(Integer id);
    public User editUser(User user);
    public User findUser(Integer id);
    public Collection<User> getAllUsers();
    public User findByName(String name);
    public User findByEmail(String email);
}