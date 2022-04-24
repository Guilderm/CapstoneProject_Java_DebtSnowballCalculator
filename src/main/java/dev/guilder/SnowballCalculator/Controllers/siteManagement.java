package dev.guilder.SnowballCalculator.Controllers;

import dev.guilder.SnowballCalculator.Entitys.Product;
import dev.guilder.SnowballCalculator.Entitys.User;
import dev.guilder.SnowballCalculator.Services.ProductService;
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
    @Autowired
    private ProductService productService;
    
    @GetMapping("/adminDashboard")
    public String adminDashboard(Model model) {
        List <User> userList = userService.getAllUsers();
        List <Product> productList = productService.getAllProducts();
        model.addAttribute("users", userList);
        model.addAttribute("products", productList);
        return "siteManagement/adminDashboard";
    }
}
