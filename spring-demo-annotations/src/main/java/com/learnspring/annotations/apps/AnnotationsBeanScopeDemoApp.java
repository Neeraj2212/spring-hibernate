package com.learnspring.annotations.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnspring.annotations.beans.Coach;

public class AnnotationsBeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = tennisCoach == alphaCoach;

        // Default scope is singleton different in prototype
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory Location for the tennisCoach" + tennisCoach);
        System.out.println("\nMemory Location for the alphaCoach" + alphaCoach);

        context.clearResourceCaches();
        context.close();
    }
}
