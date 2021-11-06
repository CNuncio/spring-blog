//package com.codeup.springblog.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.concurrent.ThreadLocalRandom;
//
//@Controller
//public class RollDiceController {
//
//    @GetMapping("/roll-dice")
//    @ResponseBody
//    public String showRollDice() {
//
//        return "roll-dice";
//    }
//
//    @GetMapping("/roll-dice/{n}")
//    @ResponseBody
//    public String rollDice(@PathVariable int n, Model model) {
//        String message;
//        int randomNum1 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
//        int randomNum2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
//        int randomNum3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
//        int randomNum4 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
//        if (n == randomNum1 || n == randomNum2 || n == randomNum3 || n == randomNum4) {
//            message = "You guessed right!";
//        } else {
//            message = "Sorry. Guess again.";
//        }
//        model.addAttribute("randomNum1", randomNum1);
//        model.addAttribute("randomNum2", randomNum2);
//        model.addAttribute("randomNum3", randomNum3);
//        model.addAttribute("randomNum4", randomNum4);
//        model.addAttribute("n", n);
//        model.addAttribute("message", message);
//    }
// return "roll-results";
//}
