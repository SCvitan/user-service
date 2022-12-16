package com.example.userservice.service;


import com.example.userservice.model.Users;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;




    public Users findByUserId(Long userId) {
        return userRepository.findByUserId(userId);
    }

    public List<Users> findAll() {
        return userRepository.findAll();
    }

    public Users save(Users user) {
        return userRepository.save(user);
    }

    public void deleteById(Long userId) {
         userRepository.deleteById(userId);
    }
}
