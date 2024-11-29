package com.exercisenow.enterprise.Controller;

import com.exercisenow.enterprise.dto.User;
import com.exercisenow.enterprise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Display user profile
    @GetMapping("/details")
    public String userDetails(Model model) {
        User user = userService.getSingleUser(); // Fetch the signed-up user's details
        if (user == null) {
            // Redirect to the sign-up page if no user exists
            return "redirect:/user/profile";
        }
        model.addAttribute("user", user);
        return "user-details";
    }

    // Display profile form for creating/updating user
    @GetMapping("/profile")
    public String userProfileForm(Model model) {
        model.addAttribute("user", new User());
        return "profile";
    }

    // Save or update user
    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user, Model model) {
        try {
            userService.saveUser(user);
            return "redirect:/user/details";
        } catch (Exception e) {
            model.addAttribute("error", "Failed to save user: " + e.getMessage());
            return "profile";
        }
    }


    @GetMapping("/delete")
    public String deleteUser() {
        userService.deleteUser();
        return "redirect:/user/profile";
    }
}
