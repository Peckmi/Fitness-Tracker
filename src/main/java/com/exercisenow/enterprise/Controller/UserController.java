package com.exercisenow.enterprise.Controller;

import com.exercisenow.enterprise.dto.User;
import com.exercisenow.enterprise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Display the form for adding a new user
    @GetMapping("/profile")
    public String userProfileForm(Model model) {
        model.addAttribute("user", new User());
        return "profile";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user, Model model) {
        try {
            userService.saveUser(user);
            return "redirect:/user/list";
        } catch (Exception e) {
            model.addAttribute("error", "Failed to save user: " + e.getMessage());
            return "profile";
        }
    }

    // Edit user details
    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {
        Optional<User> user = userService.getUserById(id);
        if (user.isPresent()) {
            model.addAttribute("user", user.get());
            return "profile"; // Use the same form for editing
        } else {
            return "redirect:/user/{id}";
        }
    }

    // Delete a user
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/profile";
    }
}



