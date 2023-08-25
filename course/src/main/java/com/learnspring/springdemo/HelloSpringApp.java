package com.learnspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	    Coach theCoach = context.getBean("myCoach",Coach.class);
	    
	    System.out.println(theCoach.getDailyWorkout());
	    System.out.println(theCoach.getDailyFortune());
	    
	    Coach theCoach2 = context.getBean("myCricketCoach", Coach.class);
	    System.out.println(theCoach2.getDailyWorkout());
	    System.out.println(theCoach2.getDailyFortune());
	    context.close();

	}

}
