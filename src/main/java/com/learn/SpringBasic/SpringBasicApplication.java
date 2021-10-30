package com.learn.SpringBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan // We can also use it despite SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		// ApplicationContext is IoC container that instantiate beans
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class, args);

	}
}
