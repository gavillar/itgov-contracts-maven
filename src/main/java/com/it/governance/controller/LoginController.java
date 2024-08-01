package com.it.governance.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {

    @PostMapping("/login")
    public String processLogin(@RequestParam("email") String email,
                               @RequestParam("password") String password,
                               Model model) {

        if ("user@example.com".equals(email) && "password".equals(password)) {
            return "redirect:/showThirdEmployees";
        } else {
            model.addAttribute("error", "Email ou senha inválidos");
            return "login";
        }
    }

}