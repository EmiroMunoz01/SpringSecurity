package com.login.login.service;

import java.util.List;

import com.login.login.model.User;

public interface IUser {

    public List <User> getAllUsers();

    public void deleteUserById(Integer idUsuario);

    public User getUserById(Integer idUsuario);

    public User updateUser( User usuario);

    public User saveUser(User usuario);

}
