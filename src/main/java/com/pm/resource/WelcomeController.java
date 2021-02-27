package com.pm.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class WelcomeController {

    @GetMapping("/public")
    public String welcomePublic(){
        return "Witaj unnamed friend !";
    }

    // jsr250Enabled
    //ROLE bo spring security ma domyslnie ustawiony taki prefix
    @RolesAllowed({"ROLE_USER"})
    @GetMapping("/user")
    public String welcomeUser(){
        return "Witaj user !";
    }

    // jsr250Enabled
    @RolesAllowed({"ROLE_ADMIN"})
    @GetMapping("/admin")
    public String welcomeAdmin(){
        return "Witaj admin !";
    }


}
