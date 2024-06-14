package com.example.Dashboard.controller;

import com.example.Dashboard.model.User;
import com.example.Dashboard.service.AccountstatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountStatementController {


    private AccountstatementService.UserService userService;

    @GetMapping("/profile")
    public String getUserProfile(Model model) {

        User user = userService.getUserDetails();

        model.addAttribute("userName", user.getName());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("phone", user.getPhone());
        model.addAttribute("address", user.getAddress());

        return "userprofile";
    }

    @PostMapping
    public String updateUserProfile(@ModelAttribute User updatedUser) {
        userService.updateUserDetails(updatedUser);
        return "redirect:/profile/userprofile";
    }
}
