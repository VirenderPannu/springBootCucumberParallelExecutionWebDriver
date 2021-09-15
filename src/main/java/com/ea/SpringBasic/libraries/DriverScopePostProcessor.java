package com.ea.SpringBasic.libraries;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DriverScopePostProcessor implements BeanFactoryPostProcessor {

    DriverScope driverScope = new DriverScope();

    // SimpleThreadScope class is available as part of Spring dependency jars but this scope is not implicitely registered as an available scope to IoC Container or common app context. 
    // In order to use it, we need to register it explicitely first to common app Context. One easy way to register it is by writing a custom ConfigurableBeanFactory and BeanFactoryPostProcessor
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        configurableListableBeanFactory.registerScope("driverscope", driverScope);
    }
}
