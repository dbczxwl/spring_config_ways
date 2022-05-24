package com.branch.don.practice_for_spring.bean.impl.tool;

import org.springframework.stereotype.Component;

import com.branch.don.practice_for_spring.bean.Tool;

// It is recommended to display the instance name
@Component("hammer")
public class Hammer implements Tool {
	@Override
	public void use() {
		System.out.println("Hammer can be used.");
	}

}
