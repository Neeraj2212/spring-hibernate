package com.learnspring.springdemo.beans;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice Baseball for 1hr a day";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
}
