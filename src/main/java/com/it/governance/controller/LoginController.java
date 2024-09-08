package com.it.governance.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {

    @PostMapping("/login")
    public String processLogin(@RequestParam("email") String email,
                               @RequestParam("password") String password,
                               Model model) {
        if ("gv@gmail.com".equals(email) && "123".equals(password)) {
            return "redirect:/";
        } else {
            model.addAttribute("error", "Email ou senha inválidos");
            return "login";
        }
    }
}
