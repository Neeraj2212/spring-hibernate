package com.learnspring.annotations.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnspring.annotations.beans.Coach;

public class AnnotationsDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        context.clearResourceCaches();
        context.close();
    }
}
