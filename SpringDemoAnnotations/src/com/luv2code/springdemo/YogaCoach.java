package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class YogaCoach implements Coach {

	private FortuneService theFortuneService;
	
	//@Value("${team}")
	private String team;
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param theFortuneService
	 */
	public YogaCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Strech for 10 Minutes before yoga";
	}

	@Override
	public String getDailyFortune() {
		
		return theFortuneService.getDailyFortune();
	}

}
