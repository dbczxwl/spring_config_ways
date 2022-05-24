package com.branch.don.practice_for_spring.bean.impl.animal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

import com.branch.don.practice_for_spring.bean.Animal;
import com.branch.don.practice_for_spring.bean.PlayService;
import com.branch.don.practice_for_spring.bean.Tool;

public class Human implements Animal {
	@Value("${software.ownerEmail}")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private Tool tool;

	private PlayService playService;

	public Human() {

	}

	// Constructor Injection
	public Human(Tool tool, PlayService playService) {
		this.tool = tool;
		this.playService = playService;
	}

	@Override
	public void eat() {
		System.out.println("Eat sth.");
	}

	@Override
	public void move() {
		System.out.println("Hurry up move on and play.");
		playService.play();
	}

	@Override
	public void work() {
		String email = this.getEmail();
		System.out.println("My email is " + email);
		System.out.println("Hard work with the tool.");
		tool.use();
	}

	@PostConstruct
	public void initHuman() {
		System.out.println("Init human");
	}

	@PreDestroy
	public void destroyHuman() {
		System.out.println("Destroy human");
	}

}
