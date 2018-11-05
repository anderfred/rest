package com.anderfred.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
    Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @RequestMapping("/")
    public Greeting greeting() {
        logger.info("/");

        return new Greeting(32 , "fredx");
    }

}