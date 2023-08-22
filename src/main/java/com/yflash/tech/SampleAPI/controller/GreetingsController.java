package com.yflash.tech.SampleAPI.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class GreetingsController {

    private static final Logger LOGGER = LogManager.getLogger(GreetingsController.class);

}
