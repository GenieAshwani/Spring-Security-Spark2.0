package com.genie.SSP03_DataBase.controller;


import com.genie.SSP03_DataBase.entity.UserEntity;
import com.genie.SSP03_DataBase.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;


    @GetMapping("/admin")
    public String adminKaMethod()
    {
        return "main admin hu";
    }

    @GetMapping("/user")
    public String userKaMethod()
    {
        return "user ya admin hu main";
    }

    @GetMapping("/db")
    public Optional<UserEntity> dbKaMethod()
    {
        return userRepo.findByEmail("manish@gmail.com");
    }
}
