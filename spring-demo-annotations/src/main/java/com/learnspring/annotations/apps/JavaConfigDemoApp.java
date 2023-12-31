package com.learnspring.annotations.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.annotations.SportConfig;
import com.learnspring.annotations.beans.Coach;

public class JavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Bean is defined in springConfig.java
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        context.clearResourceCaches();
        context.close();
    }
}
