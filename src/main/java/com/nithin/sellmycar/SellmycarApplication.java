package com.nithin.sellmycar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SellmycarApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SellmycarApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		// alien.setCom(new Desktop());
		alien.alien();

	}

}
