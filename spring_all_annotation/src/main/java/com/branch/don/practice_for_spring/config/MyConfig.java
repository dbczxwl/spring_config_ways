package com.branch.don.practice_for_spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.branch.don.practice_for_spring.bean.Animal;
import com.branch.don.practice_for_spring.bean.PlayService;
import com.branch.don.practice_for_spring.bean.Tool;
import com.branch.don.practice_for_spring.bean.impl.animal.Human;
import com.branch.don.practice_for_spring.bean.impl.playservice.HumanPlay;
import com.branch.don.practice_for_spring.bean.impl.tool.Hammer;

@Configuration
@ComponentScan("com.branch.don.practice_for_spring")
@PropertySource("classpath:application.properties")
public class MyConfig {

	@Bean
	public Tool hammer() {
		return new Hammer();

	}

	@Bean
	public PlayService humanPlay() {
		return new HumanPlay();

	}

	@Bean
	public Animal human() {
		return new Human(hammer(), humanPlay());

	}

}
