package com.codeup.springblog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;

@Controller
public class CoffeeController {
    @GetMapping("/coffee")
    public String coffeeInfo() {
        return "views-lecture/coffee";
    }

    @GetMapping("/coffee/{roast}")
    public String roastSelection(@PathVariable String roast, Model model) {
        model.addAttribute("roast", roast);
//        boolean choseICED = false;
//        if (roast.equals("ICED")) {
//            choseICED = true;
//        }
//        model.addAttribute("choseICED", choseICED);
        // to make html changes
        return "views-lecture/coffee";
    }
}
