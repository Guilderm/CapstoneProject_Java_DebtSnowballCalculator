package dev.guilder.SnowballCalculator.Controllers;

import dev.guilder.SnowballCalculator.Entitys.Product;
import dev.guilder.SnowballCalculator.Services.ProductService;
import dev.guilder.SnowballCalculator.UserManagement.Entitys.AppUser;
import dev.guilder.SnowballCalculator.UserManagement.Service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class siteManagement {
    @Autowired
    private UserServiceImp userServiceImp;
    @Autowired
    private ProductService productService;

    @GetMapping("/adminDashboard")
    public String adminDashboard(Model model) {
        List<AppUser> usersList = userServiceImp.getAllUsers();
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("appUser", usersList);
        model.addAttribute("products", productList);
        return "siteManagement/adminDashboard";
    }
}
