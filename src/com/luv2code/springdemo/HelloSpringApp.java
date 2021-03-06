package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file; not hard coded
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		// id interface
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(soccerCoach.getDailyWorkout());

		// call new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();

	}

}
