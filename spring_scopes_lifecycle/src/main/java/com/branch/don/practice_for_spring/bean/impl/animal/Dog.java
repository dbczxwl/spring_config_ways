package com.branch.don.practice_for_spring.bean.impl.animal;

import com.branch.don.practice_for_spring.bean.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog eat");
	}

	@Override
	public void move() {
		System.out.println("Dog move");
	}

	@Override
	public void work() {
		System.out.println("Dog work");
	}

	public void initMyDog() {
		System.out.println("Init my dog");
	}

	public void destroyMyDog() {
		System.out.println("Destroy my dog");
	}

}
