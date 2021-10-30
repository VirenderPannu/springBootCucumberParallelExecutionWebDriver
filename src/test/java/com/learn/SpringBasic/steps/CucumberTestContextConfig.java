package com.learn.SpringBasic.steps;


import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration // Cucumber Test Context Configuration for Spring
@SpringBootTest // To bootstarp the entire IoC container i.e. ApplicationContext
public class CucumberTestContextConfig {
}
