package com.example.userservice.controller;


import com.example.userservice.model.Users;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public Users saveUser( @RequestBody Users user){
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public Users getUser( @PathVariable("id") Long userId){
        return userService.findByUserId(userId);
    }

    @GetMapping("/all")
    public List<Users> getAllUsers(){
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteUser( @PathVariable("id") Long userId ){
         userService.deleteById(userId);
    }

}
