package dev.guilder.SnowballCalculator.Controllers;

import dev.guilder.SnowballCalculator.Entitys.Product;
import dev.guilder.SnowballCalculator.Services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class paymentManagement {
    @Autowired
    private ProductService productService;
    
    @GetMapping("/Checkout")
    public String checkoutPage() {
        return "paymentManagement/checkoutPage";
    }

    @GetMapping("/invoice")
    public String invoicePage() {
        return "paymentManagement/invoicePage";
    }
    
    @GetMapping("/addCart/{productId}")
    public String addCart(@PathVariable("productId") Long idProduct, Model model){
        List<Product> productList = productService.getAllProducts();
        //Product product = productService.getProductById(idProduct);
        model.addAttribute("newItem", productList);
        return "redirect:/shoppingCart";
    }
}
