package com.example.challenge.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChallengeController {
    @GetMapping("/hello")
    String greet(@RequestParam(defaultValue = "World") String name) {

        return "Hello " + name + "!";


    }


    }
