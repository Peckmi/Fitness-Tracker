package com.exercisenow.enterprise.service;

import com.exercisenow.enterprise.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercisenow.enterprise.dto.User;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(int userId) {
        return userRepository.findById(userId);
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}

