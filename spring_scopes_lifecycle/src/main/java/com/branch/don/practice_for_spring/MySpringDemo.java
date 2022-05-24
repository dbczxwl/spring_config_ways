package com.branch.don.practice_for_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.branch.don.practice_for_spring.bean.Animal;

public class MySpringDemo {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// scope = singleton
		Animal human1 = context.getBean("myAnimal", Animal.class);
		Animal human2 = context.getBean("myAnimal", Animal.class);
		System.out.println(human1 == human2);

		// scope = prototype, under this scope destroy-method is invalid
		// lifecycle: Container Start->Bean Instantiated->Dependencies
		// Injected->Internal Spring Processing->Your Custom Init Method
		Animal dog1 = context.getBean("myAnimalDog", Animal.class);
		Animal dog2 = context.getBean("myAnimalDog", Animal.class);
		System.out.println(dog1 == dog2);
		dog1.eat();
		dog1.move();

		Animal cat1 = context.getBean("myAnimalCat", Animal.class);
		Animal cat2 = context.getBean("myAnimalCat", Animal.class);
		System.out.println(cat1 == cat2);
		cat1.eat();
		cat2.move();
		context.close();

	}

}
