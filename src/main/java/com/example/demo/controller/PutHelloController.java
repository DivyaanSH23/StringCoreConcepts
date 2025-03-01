package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class PutHelloController {

    // Add Logger
    private static final Logger logger = LoggerFactory.getLogger(PutHelloController.class);

    @PutMapping("/put/{firstName}")
    public String updateHello(@PathVariable String firstName, @RequestParam String lastName) {
        logger.info("Received PUT request with firstName: {} and lastName: {}", firstName, lastName);

        String response = "Hello " + firstName + " " + lastName + " from BridgeLabz";
        logger.info("Response: {}", response);

        return response;
    }
}
