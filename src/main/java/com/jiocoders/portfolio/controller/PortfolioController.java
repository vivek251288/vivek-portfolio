package com.jiocoders.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
    
    // Serve JSP page
    @GetMapping({"/", "/portfolio"})
    public String home() {
        return "index2"; // maps to /WEB-INF/jsp/index.jsp
    }
}