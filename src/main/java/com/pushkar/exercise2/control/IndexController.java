package com.pushkar.exercise2.control;

import com.pushkar.exercise2.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    User user = null;

    @GetMapping("/")
    public String base(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/index")
    public String submitForm(@ModelAttribute User user){
        return "home";
    }

    @GetMapping("/home")
    public String home(Model model){
        if(user == null){
            return "index";
        } else {
            model.addAttribute("user", user);
            return "home";
        }
    }
}
