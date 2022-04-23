package dev.guilder.SnowballCalculator.Controllers;

import dev.guilder.SnowballCalculator.Entitys.User;
import dev.guilder.SnowballCalculator.Services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class siteManagement {
    @Autowired
    private UserService userService;
    
    @GetMapping("/adminDashboard")
    public String adminDashboard(Model model) {
        List <User> userList = userService.getAllUsers();
        model.addAttribute("users", userList);
        return "siteManagement/adminDashboard";
    }
}
