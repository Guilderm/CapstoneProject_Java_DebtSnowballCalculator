package dev.guilder.SnowballCalculator.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class paymentManagement {
    @GetMapping("/Checkout")
    public String checkoutPage() {
        return "paymentManagement/checkoutPage";
    }

    @GetMapping("/invoice")
    public String invoicePage() {
        return "paymentManagement/invoicePage";
    }
}
