package com.login.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.login.model.User;
import com.login.login.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api-jwt")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/index1")
    public String index1() {
        return "inicioSeguro";
    }

    @GetMapping("/index2")
    public String index2() {
        return "inicioNOSeguro";
    }

    @GetMapping("/get-all/users")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @PostMapping("/create/user")
    public User createUser(@RequestBody User user) {

        return this.userService.saveUser(user);

    }

    @GetMapping("/get-by-id/user/{id}")
    public User getUserById(@PathVariable Integer id) {
        return this.userService.getUserById(id);
    }

    @DeleteMapping("/delete/user/{id}")
    public void deleteById(@PathVariable Integer id) {
        this.userService.deleteUserById(id);
    }

}
