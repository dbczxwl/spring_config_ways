package com.branch.don.practice_for_spring.bean.impl.animal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.branch.don.practice_for_spring.bean.Animal;

@Component("myAnimalCat")
@Scope("singleton")
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

	@PostConstruct
	public void initMyCat() {
		System.out.println("Init my cat");
	}

	@PreDestroy
	public void destroyMyCat() {
		System.out.println("Destroy my cat");
	}

}
