package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @GetMapping("/hello")
    @ResponseBody
    public String returnHello() {
        return "Hello World";
    }

    @GetMapping("/howdy")
    @ResponseBody
    public String returnHowdy() {
        return "Howdy";
    }

@GetMapping("/color/{color}")
    @ResponseBody
    public String returnColor(@PathVariable String color) {
        return "<h1 style='color:" + color + " '>" + color + "</h1>";


}

@GetMapping("/bg/{color1}/font/{color2}")
    @ResponseBody
    public String returnBgFontColor(@PathVariable String color1, @PathVariable String color2) {
        return String.format("<h1 style='background-color:%s;color:%s'>%s</h1>", color1, color2, color2);
    }

    @GetMapping("/name")
    @ResponseBody
    public String returnName(@RequestParam(defaultValue = "Hello World") String n) {
        return "Returning name: " + n;
    }

}
