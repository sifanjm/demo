package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

private static Logger logger = LogManager.getLogger(HomeController.class);

    @GetMapping("/home")
    public String home(){
        logger.error("home api is invoked");
        return "home page";
    }

}
