package com.branch.don.practice_for_spring.bean.impl.animal;

import com.branch.don.practice_for_spring.bean.Animal;
import com.branch.don.practice_for_spring.bean.PlayService;
import com.branch.don.practice_for_spring.bean.Tool;

public class Human implements Animal {
	private Tool tool;

	private PlayService playService;

	private String email;

	public Human() {

	}

	// Constructor Injection
	public Human(Tool tool) {
		this.tool = tool;
	}

	// Setter Injection
	public void setPlayService(PlayService playService) {
		this.playService = playService;
	}

	public String getEmail() {
		return email;
	}

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
