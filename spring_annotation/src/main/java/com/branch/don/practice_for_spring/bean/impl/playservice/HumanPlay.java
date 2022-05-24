package com.branch.don.practice_for_spring.bean.impl.playservice;

import org.springframework.stereotype.Component;

import com.branch.don.practice_for_spring.bean.PlayService;

@Component
public class HumanPlay implements PlayService {
	@Override
	public void play() {
		System.out.println("Let's play with human.");
	}

}
