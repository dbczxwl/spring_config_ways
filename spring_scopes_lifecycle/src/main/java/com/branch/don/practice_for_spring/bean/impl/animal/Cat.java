package com.branch.don.practice_for_spring.bean.impl.animal;

import com.branch.don.practice_for_spring.bean.Animal;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("Cat eat");
	}

	@Override
	public void move() {
		System.out.println("Cat move");
	}

	@Override
	public void work() {
		System.out.println("Cat work");
	}

	public void initMyCat() {
		System.out.println("Init my cat");
	}

	public void destroyMyCat() {
		System.out.println("Destroy my cat");
	}

}
