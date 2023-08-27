package com.learnspring.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    // Field Injection
    @Autowired
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
