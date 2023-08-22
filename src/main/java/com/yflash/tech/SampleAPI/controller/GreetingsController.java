package com.yflash.tech.SampleAPI.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/i18n")
public class GreetingsController {

    @Autowired
    MessageSource messageSource;

    private static final Logger LOGGER = LogManager.getLogger(GreetingsController.class);

//    @GetMapping(value = "/get-greeting-internationalized")
//    public String getGreetings(@RequestHeader(value = "Accept-Language", required = false) Locale locale, HttpServletRequest request) {
//        LOGGER.info("Request intercepted : {}", request.getRequestURI());
//        LOGGER.info("Locale used : {}", locale == null ? "us" : locale);
//        return messageSource.getMessage("good.morning.message",null, locale);
//    }

    @GetMapping(value = "/get-greeting-internationalized")
    public String getGreetings(HttpServletRequest request) {
        /**
         * Instead of fetching the Locale from the handler method parameter each time for different methods,
         * we could simply use the LocaleContextHolder.getLocale() method
         * NOTE: to achieve this behaviour, we must ensure that the LocaleResolver bean should be implemented via AcceptHeaderLocaleResolver class
         */
        LOGGER.info("Request intercepted : {}", request.getRequestURI());
        Locale locale = LocaleContextHolder.getLocale();
        LOGGER.info("Locale used : {}", locale);
        return messageSource.getMessage("good.morning.message",null, locale);
    }

}
