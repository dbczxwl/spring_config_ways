package com.branch.don.practice_for_spring.bean.impl.tool;

import org.springframework.stereotype.Component;

import com.branch.don.practice_for_spring.bean.Tool;

@Component("knife")
public class Knife implements Tool {
	@Override
	public void use() {
		System.out.println("Knife can be used.");
	}
}
