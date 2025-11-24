package com.jiocoders.portfolio.controller;

//import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/portfolio")
public class HomeController {

    @GetMapping("/info")
    public String info() {
        return "Portfolio API working!: Java-coder";
    }
}