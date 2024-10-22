package com.genie.SpringSecurityP02_RoleBase_Auth.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {


    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminKaMethod()
    {
        return "main admin hu";
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    @GetMapping("/user")
    public String userKaMethod()
    {
        return "user ya admin hu main";
    }
}
