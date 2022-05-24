package com.branch.don.practice_for_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.branch.don.practice_for_spring.bean.Animal;
import com.branch.don.practice_for_spring.bean.impl.animal.Human;

public class MySpringDemo {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Animal animal = new Human();
		// retrieve bean from spring container
		Animal human = context.getBean("myAnimal", Animal.class);

		// call methods on the bean
		human.work();
		human.move();
		System.out.println(((Human) human).getEmail());
		// close the context
		context.close();

	}

}
