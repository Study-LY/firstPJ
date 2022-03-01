package com.example.firstPJ.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("/")
    public String main(){
        return "main";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/join")
    public String join(){
        return "join";
    }

    @RequestMapping("/joinok")
    public String joinok(){
        return "joinok";
    }

}
