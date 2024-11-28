package com.example.beginnerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeginnerAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BeginnerAppApplication.class, args);

		Dev obj = context.getBean(Dev.class);
		obj.build();
    }

}
