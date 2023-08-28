package com.learnspring.annotations.beans;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    @Value("${sport.email}")
    private String email;

    @Value("${sport.team}")
    private String team;

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swin 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return "Email: " + email;
    }

    public String getTeam() {
        return "Team: " + team;
    }

}
