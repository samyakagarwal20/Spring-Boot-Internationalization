package com.yflash.tech.SampleAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class InternationalizationConfig {

//    @Bean
//    public LocaleResolver localResolver() {
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//        localeResolver.setDefaultLocale(Locale.US);
//        return localeResolver;
//    }

    @Bean
    public LocaleResolver localResolver() {
        /**
         * Instead of using the SessionLocaleResolver, we can use a more specific implementation AcceptHeaderLocaleResolver class
         * as we are fetching the locale from the value of "Accept-Language" header
         * It's advantage is that we don't need to define the @RequestHeader annotated parameter to fetch the Locale in each of the controller class methods.
         */
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }

    /**
     * Instead of creating a bean explicitly for ResourceBundleMessageSource for managing the resource bundle
     * we can use the spring.messages.basename property and let spring auto-configuration take care of it
     */

//    @Bean
//    public ResourceBundleMessageSource resourceBundleMessageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }

}
