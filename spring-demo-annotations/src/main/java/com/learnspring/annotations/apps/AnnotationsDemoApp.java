package com.learnspring.annotations.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnspring.annotations.beans.Coach;

public class AnnotationsDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());

        context.clearResourceCaches();
        context.close();
    }
}
