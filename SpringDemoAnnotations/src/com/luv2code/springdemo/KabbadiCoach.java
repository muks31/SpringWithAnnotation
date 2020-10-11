package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class KabbadiCoach implements Coach{
	
	@Autowired
	private FortuneService theFortuneService;
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Try holding your breath for 30 second";
	}

	@Override
	public String getDailyFortune() {
		
		return theFortuneService.getDailyFortune();
	}

}
