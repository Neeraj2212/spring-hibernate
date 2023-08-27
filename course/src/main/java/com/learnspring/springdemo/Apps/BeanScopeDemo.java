package com.learnspring.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnspring.springdemo.beans.Coach;

public class BeanScopeDemo {
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
