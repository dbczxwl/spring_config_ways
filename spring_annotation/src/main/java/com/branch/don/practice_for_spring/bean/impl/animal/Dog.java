package com.branch.don.practice_for_spring.bean.impl.animal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.branch.don.practice_for_spring.bean.Animal;

@Component
@Scope("prototype")
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

	@PostConstruct
	public void initMyDog() {
		System.out.println("Init my dog");
	}

	@PreDestroy
	public void destroyMyDog() {
		System.out.println("Destroy my dog");
	}

}
