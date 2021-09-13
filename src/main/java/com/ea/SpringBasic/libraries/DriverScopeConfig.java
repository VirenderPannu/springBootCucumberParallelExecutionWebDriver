package com.ea.SpringBasic.libraries;


import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DriverScopeConfig {

    // Returns the Driver scope object/bean whenever it requires
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new DriverScopePostProcessor();
    }
}
