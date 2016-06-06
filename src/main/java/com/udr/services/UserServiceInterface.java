package com.udr.services;

import com.udr.models.User;

import java.util.Collection;

public interface UserServiceInterface {

    public User saveUser(User user);
    public Boolean deleteUser(Integer id);
    public User editUser(User user);
    public User findUser(Integer id);
    public Collection<User> getAllUsers();
    public User findByName(String name);
    public User findByEmail(String email);
}