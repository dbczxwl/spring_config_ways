package com.branch.don.practice_for_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class PracticeForSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeForSpringApplication.class, args);
	}

}
