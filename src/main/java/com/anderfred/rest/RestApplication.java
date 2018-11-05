package com.anderfred.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {
    static Logger logger = LoggerFactory.getLogger(RestApplication.class);
    public static void main(String[] args) {
        logger.info("Init");
        SpringApplication.run(RestApplication.class, args);

    }
}
