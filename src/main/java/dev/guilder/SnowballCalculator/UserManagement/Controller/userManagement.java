package dev.guilder.SnowballCalculator.UserManagement.Controller;

import dev.guilder.SnowballCalculator.UserManagement.Entitys.AppUser;
import dev.guilder.SnowballCalculator.UserManagement.Service.AppUserService;
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
    private AppUserService appUserService;

    @GetMapping("/userSignUp")
    public String userSignUpPage(Model model) {
        model.addAttribute("newUser", new AppUser());
        return "userManagement/userSignUp";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute AppUser appUser) {
        appUserService.saveUser(appUser);
        return "redirect:/";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long idUser) {
        appUserService.deleteUser(idUser);
        return "redirect:/adminDashboard";
    }

    @GetMapping("/changeUser/{id}")
    public String changeUser(@PathVariable("id") Long idUser, Model model) {
        AppUser appUser = appUserService.getUserById(idUser);
        model.addAttribute("alterUser", appUser);
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
