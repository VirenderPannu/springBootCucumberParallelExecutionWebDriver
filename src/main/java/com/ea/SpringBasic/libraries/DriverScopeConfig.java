package com.ea.SpringBasic.libraries;


import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Hooking up the DriverCustomScope as a component/configuration with SpringBoot Container
public class DriverScopeConfig {

    // Returns the Bean of already registered DriverCustomScope whenever it requires
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new DriverScopePostProcessor();
    }
}
