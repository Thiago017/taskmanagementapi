package com.thiagopereira.taskmanagementapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class GreetingController {

    @GetMapping(path = "/greeting")
    public String index() {
        return "Hello world";
    }

}
