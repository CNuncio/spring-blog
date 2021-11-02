package com.codeup.springblog.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String getAds() {
        return "Post index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getAds(@PathVariable long id) {
        return "ad for id" + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String viewPost(@PathVariable long id) {
        return "<input type=\"input\" name=\"post\"/>";
    }

//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String createPost() {
//        return
//    }
}
