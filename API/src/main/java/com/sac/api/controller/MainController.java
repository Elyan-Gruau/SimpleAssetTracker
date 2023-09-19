package com.sac.api.controller;

import org.springframework.web.bind.annotation.*;

import java.security.SecureRandom;

@RestController
public class MainController {

    SecureRandom rand = new SecureRandom();

    @GetMapping("/ping")
    public String ping() {
        return "I'm alive";
    }


}
