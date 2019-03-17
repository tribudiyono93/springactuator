package com.example.actuator.springactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@SpringBootApplication
public class SpringactuatorApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringactuatorApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		int i = 1;
		while(true) {
			System.out.println("Increment index ke " + i);
			System.out.println("Sleep 1 seconds");
			Thread.sleep(1000);
		}
	}

}
