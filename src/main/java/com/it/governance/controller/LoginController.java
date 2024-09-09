package com.it.governance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/process-login")
    public String processLogin(@RequestParam("email") String email,
                               @RequestParam("password") String password,
                               Model model) {

        if ("user@tvx.com.br".equals(email) && "n84ip3".equals(password)) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", true);
            return "login";
        }
    }
}


