package dev.guilder.SnowballCalculator.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class siteManagement {
    @GetMapping("/adminDashboard")
    public String adminDashboard() {
        return "siteManagement/adminDashboard";
    }
}