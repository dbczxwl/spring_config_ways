package com.branch.don.practice_for_spring.bean.impl.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.branch.don.practice_for_spring.bean.Animal;
import com.branch.don.practice_for_spring.bean.PlayService;
import com.branch.don.practice_for_spring.bean.Tool;

@Component("human")
// singleton is default value
@Scope("singleton")
public class Human implements Animal {
	private Tool tool;

	private PlayService playService;

	// Field Injection
	@Value("${software.ownerEmail}")
	private String email;

	public Human() {

	}

	// Constructor Injection
	@Autowired
	// When there are multiple implementation classes use @Qualifier to select one
	// @Qualifier is write behind interface
	// public Human(@Qualifier("hammer") Tool tool) {
	public Human(@Qualifier("knife") Tool tool) {
		this.tool = tool;
	}

	// Setter Injection
	@Autowired
	public void setPlayService(PlayService playService) {
		System.out.println("setPlayService");
		this.playService = playService;
	}

	// every method can be injected
	@Autowired
	public void setAnyMethodPlayService() {
		System.out.println("setAnyMethodPlayService, every method can be injected");
	}

	public String getEmail() {
		return email;
	}

	// Setter Injection
	public void setEmail(String email) {
		this.email = email;
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

}
