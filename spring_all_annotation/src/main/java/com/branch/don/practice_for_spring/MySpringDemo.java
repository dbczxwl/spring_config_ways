package com.branch.don.practice_for_spring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.branch.don.practice_for_spring.bean.Animal;
import com.branch.don.practice_for_spring.config.MyConfig;

public class MySpringDemo {

	public static void main(String[] args) throws InterruptedException {
		// load the spring config class, use the param type Class<?> not String!!!
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		System.out.println(Arrays.asList(context.getBeanDefinitionNames()));
		
		// get bean from container
		Animal human = context.getBean("human", Animal.class);

		// call the method in the bean
		human.eat();
		human.move();
		human.work();

		// close the context
		context.close();
	}

}
