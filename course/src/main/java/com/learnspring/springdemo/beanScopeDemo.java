package com.learnspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // In case of singlton scope which is default both objects will refer to same
        // object
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = theCoach == alphaCoach;

        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory Address for theCoach: " + theCoach);

        System.out.println("\nMemory Address for alphaCoach: " + alphaCoach + '\n');

        context.close();

    }
}
