package minlee.spring4.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(Model m){

        m.addAttribute("msg","Hello, World");

            return "index";

    }
}
