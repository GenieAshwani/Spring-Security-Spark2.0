package com.genie.SpringSecurityApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


  /*  @GetMapping("/start-quiz")
    public String m1()
    {
        return "start-quiz";
    }

    @GetMapping("/login")
    public String m2()
    {
        return "login";
    }*/


    @GetMapping("/contact")
    public String contactUS()
    {
        return "PhoneNO:2345678765432";
    }

    @GetMapping("/updates")
    public String updates()
    {
        return "car loan interest drop upto 2%";
    }

    @GetMapping("/check")
    public String checkBalance()
    {
        return "1000000";
    }

    @GetMapping("/transfer")
    public String transfer()
    {
        return "Transfer done....";
    }
}

