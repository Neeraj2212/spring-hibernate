package com.learnspring.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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

}
