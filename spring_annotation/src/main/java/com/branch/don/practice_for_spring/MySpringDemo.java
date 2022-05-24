package com.branch.don.practice_for_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.branch.don.practice_for_spring.bean.Animal;

public class MySpringDemo {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get bean from container
		// Use default bean name, replace first letter of class name with lowercase
		Animal human = context.getBean("human", Animal.class);

		// call the method in the bean
		human.eat();
		human.move();
		human.work();

		Animal dog = context.getBean("dog", Animal.class);
		dog.eat();
		dog.move();

		Animal cat = context.getBean("myAnimalCat", Animal.class);
		cat.eat();
		cat.move();

		// close the context
		context.close();

	}

}
