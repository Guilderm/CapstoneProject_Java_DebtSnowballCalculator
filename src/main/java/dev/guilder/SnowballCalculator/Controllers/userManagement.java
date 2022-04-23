
package dev.guilder.SnowballCalculator.Controllers;

import dev.guilder.SnowballCalculator.Entitys.User;
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
    public String userSignUpPage(Model model){
        model.addAttribute("newUser", new User());
        return "userManagement/userSignUp";
    }
    
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute User user){
        userService.saveUser(user);
        return "redirect:/";
    }
    
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long idUser){
        userService.deleteUser(idUser);
        return "redirect:/adminDashboard";
    }
    
    @GetMapping("/modifyUser/{id}")
    public String modifyUser(@PathVariable("id") Long idUser, Model model){
        User user = userService.getUserById(idUser);
        model.addAttribute("alterUser", user);
        return "siteManagement/modifyUser";
    }
    
    @GetMapping("/login")
    public String loginPage(){
        return "userManagement/loginPage";
    }
    
    @GetMapping("/profile")
    public String profilePage(){
        return "userManagement/profilePage";
    }
    
    @GetMapping("/shoppingCart")
    public String shoppingCartPage(){
        return "userManagement/shoppingCartPage";
    }
}
