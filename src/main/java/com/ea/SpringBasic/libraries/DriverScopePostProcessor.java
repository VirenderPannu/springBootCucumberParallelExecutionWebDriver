package com.ea.SpringBasic.libraries;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DriverScopePostProcessor implements BeanFactoryPostProcessor {

    // SimpleThreadScope class is available as part of Spring dependency jars but it is not registered as an available scope. 
    // In order to use it, we need to register it first. One easy way to register it is by writing a custom BeanFactoryPostProcessor
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        configurableListableBeanFactory.registerScope("driverscope", new DriverScope());
    }
}
