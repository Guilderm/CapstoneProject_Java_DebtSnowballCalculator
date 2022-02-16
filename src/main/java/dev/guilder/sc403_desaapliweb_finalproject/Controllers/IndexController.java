package dev.guilder.sc403_desaapliweb_finalproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping
    public String Home() {
        return "index";
    }
}
