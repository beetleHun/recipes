package com.beetle.recipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    @GetMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }

}
