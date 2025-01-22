package com.login.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.login.model.User;
import com.login.login.repository.UserRepository;

@Service
public class UserService implements IUser {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void deleteUserById(Integer idUsuario) {
        this.userRepository.deleteById(idUsuario);
    }

    @Override
    public User getUserById(Integer idUsuario) {
        return this.userRepository.findById(idUsuario).orElseThrow();
    }

    @Override
    public User updateUser(User usuario) {
        return this.userRepository.save(usuario);
    }

    @Override
    public User saveUser(User usuario) {
        return this.userRepository.save(usuario);

    }


}
