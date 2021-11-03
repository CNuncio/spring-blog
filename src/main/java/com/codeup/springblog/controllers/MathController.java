package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int addition(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

//    @GetMapping("/add/{num1}/and/{num2}")
//    @ResponseBody
//    public String addition(@PathVariable int num1, @PathVariable int num2) {
//        return String.valueOf(num1 + num2);
//    }


//    @GetMapping("/subtract/{num1}/from/{num2}")
//    @ResponseBody
//    public int subtract(@PathVariable int num1, @PathVariable int num2) {
//        return num1 - num2;
//    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public String subtract(@PathVariable int num1, @PathVariable int num2) {
        return String.valueOf(num1 - num2);
    }


//    @GetMapping("/multiply/{num1}/and/{num2}")
//    @ResponseBody
//    public int multiply(@PathVariable int num1, @PathVariable int num2) {
//        return num1 * num2;
//    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        return String.valueOf(num1 * num2);
    }

//    @GetMapping("/squared/{num1}/and/{num2}")
//    @ResponseBody
//    public int square(@PathVariable int num1, @PathVariable int num2) {
//        return num1 ^ num2;
//    }

    @GetMapping("/squared/{num1}/and/{num2}")
    @ResponseBody
    public String square(@PathVariable int num1, @PathVariable int num2) {
        return String.valueOf(num1 ^ num2);
    }

//    @GetMapping("/divide/{num1}/and/{num2}")
//    @ResponseBody
//    public double divide(@PathVariable int num1, @PathVariable int num2) {
//        if (num2 == 0) {
//            throw new ArithmeticException("Can't divide by 0");
//        }
//        return (double) num1 / (double) num2;
//    }

    @GetMapping("/divide/{num1}/and/{num2}")
    @ResponseBody
    public String divide(@PathVariable int num1, @PathVariable int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Can't divide by 0");
        }
        return  String.valueOf(num1 / num2);
    }

}
