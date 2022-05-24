package com.branch.don.practice_for_spring.bean.impl.tool;

import com.branch.don.practice_for_spring.bean.Tool;

public class Hammer implements Tool {
	@Override
	public void use() {
		System.out.println("Hammer can be used.");
	}

}
