package com.exercisenow.enterprise.service;

import com.exercisenow.enterprise.Repository.UserRepository;
import com.exercisenow.enterprise.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Save or update user
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    // Fetch the signed-up user's details
    public User getSingleUser() {
        return userRepository.findSingleUser();
    }

    // Delete user
    public void deleteUser() {
        userRepository.deleteUser();
    }
}



