package com.learnspring.springdemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice Baseball for 1hr a day";
	}
}
