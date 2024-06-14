package com.example.Dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {
    @GetMapping("/")
    public String dash_board(Model model){
        model.addAttribute("username", "Hello dashboard!");
        return "dash_board";
    }
}
