package com.project.myproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }
}

//https://www.youtube.com/watch?v=RroDdybvu5s 13:23