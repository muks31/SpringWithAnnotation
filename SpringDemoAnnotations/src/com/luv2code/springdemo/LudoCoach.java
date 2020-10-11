package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class LudoCoach implements Coach {

	
	private FortuneService theFortuneService;
	
	/**
	 * @param theFortuneService the theFortuneService to set
	 */
	@Autowired
	public void setTheFortuneService(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Just keep calm and take a chill Pill";
	}

	@Override
	public String getDailyFortune() {
		
		return theFortuneService.getDailyFortune();
	}

}
