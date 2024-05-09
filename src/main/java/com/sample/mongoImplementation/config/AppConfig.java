package com.sample.mongoImplementation.config;

import com.sample.mongoImplementation.services.BookingService;
import com.sample.mongoImplementation.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public BookingService booking () {
        return new BookingService();
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
