package com.learnspring.annotations.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnspring.annotations.SportConfig;
import com.learnspring.annotations.beans.SwimCoach;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        // Print injected values
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());

        context.clearResourceCaches();
        context.close();
    }
}
