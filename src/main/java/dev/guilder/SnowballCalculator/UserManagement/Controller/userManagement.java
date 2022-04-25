package dev.guilder.SnowballCalculator.UserManagement.Controller;

import dev.guilder.SnowballCalculator.Entitys.Users;
import dev.guilder.SnowballCalculator.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userManagement {

    @Autowired
    private UserService userService;

    @GetMapping("/userSignUp")
    public String userSignUpPage(Model model) {
        model.addAttribute("newUser", new Users());
        return "userManagement/userSignUp";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute Users users) {
        userService.saveUser(users);
        return "redirect:/";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long idUser) {
        userService.deleteUser(idUser);
        return "redirect:/adminDashboard";
    }

    @GetMapping("/changeUser/{id}")
    public String changeUser(@PathVariable("id") Long idUser, Model model) {
        Users users = userService.getUserById(idUser);
        model.addAttribute("alterUser", users);
        return "userManagement/modifyUserPage";
    }

    @GetMapping("/profile")
    public String profilePage() {
        return "userManagement/profilePage";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "userManagement/loginPage";
    }
}
