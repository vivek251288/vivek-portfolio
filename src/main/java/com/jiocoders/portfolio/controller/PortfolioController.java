package com.jiocoders.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
    
  
    @GetMapping({"/", "/portfolio"})
    public String home() {
        return "index2";
    }
}