package com.learnspring.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnspring.springdemo.beans.Coach;

public class BeanLifeCycleDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "beanLifecycle-applicationContext.xml");

        // Startup method will be called first
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());

        // Destroy method will be called
        context.close();

    }
}
