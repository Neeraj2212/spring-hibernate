package com.learnspring.annotations.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.annotations.SportConfig;
import com.learnspring.annotations.beans.Coach;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach swimCoach = context.getBean("swimCoach", Coach.class);

        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        context.clearResourceCaches();
        context.close();
    }
}
