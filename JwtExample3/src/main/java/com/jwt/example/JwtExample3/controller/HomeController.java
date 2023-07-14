package com.jwt.example.JwtExample3.controller;

import com.jwt.example.JwtExample3.models.User;
import com.jwt.example.JwtExample3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    //step 1 : created one protected endpoint
    // http://localhost:8081/home/users
    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("getting users");
        return userService.getUser();
    }

    // if we want logged in user information

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
