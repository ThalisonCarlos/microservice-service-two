package com.architecture.microservices.service.two.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {

    @GetMapping
    public String getService(){
        return "Service Two";
    }

}
