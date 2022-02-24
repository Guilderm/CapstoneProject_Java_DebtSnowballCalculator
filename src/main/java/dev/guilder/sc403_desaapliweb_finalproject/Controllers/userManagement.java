package dev.guilder.sc403_desaapliweb_finalproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userManagement {
    @GetMapping("/login")
    public String login() {
        return "userManagement/login";
    }

    @GetMapping("/profile")
    public String profile() {
        return "userManagement/profile";
    }

    @GetMapping("/userSignUp")
    public String userSignUp() {
        return "userManagement/userSignUp";
    }
}
