package com.nithin.sellmycar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SellmycarApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SellmycarApplication.class, args);
		AlienController alien = context.getBean(AlienController.class);

	}

}
