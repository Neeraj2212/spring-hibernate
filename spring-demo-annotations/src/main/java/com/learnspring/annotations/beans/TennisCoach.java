package com.learnspring.annotations.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope("prototype") // New Object for each request
@Scope("singleton") // Same Object for each request
public class TennisCoach implements Coach {

    // Field Injection
    @Autowired
    @Qualifier("randomFortuneService") // Use when have multiple implementations of a interface can be used with
                                       // constructor, setter/method or field

    private FortuneService fortuneService;

    // Constructor injection
    // @Autowired
    // public TennisCoach(FortuneService fortuneService) {
    // this.fortuneService = fortuneService;
    // }

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // Setter injection
    // @Autowired
    // public void setFortuneService(FortuneService fortuneService) {
    // System.out.println(">> TennisCoach: inside setter fortuneservice");
    // this.fortuneService = fortuneService;
    // }

    // Method Inejection
    // @Autowired
    // public void doSomeCrazyStuff(FortuneService fortuneService) {
    // System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
    // this.fortuneService = fortuneService;
    // }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct // for init method
    public void initMethod() {
        System.out.println(">> TennisCoach: Inside startup function");
    }

    // does not work with scope prototype
    @PreDestroy // for destory method
    public void cleanupMethod() {
        System.out.println(">> TennisCoach: Inside cleanup method");
    }

}
