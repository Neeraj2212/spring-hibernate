package com.learnspring.springdemo.beans;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard for 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// Startup Method
	public void doStartupSutff() {
		System.out.println("Inside TrackCoach StartUp Method");
	}

	// Destroy Method
	public void doCleanupStuff() {
		System.out.println("Inside TrackCoach Cleanup Method");
	}

}
