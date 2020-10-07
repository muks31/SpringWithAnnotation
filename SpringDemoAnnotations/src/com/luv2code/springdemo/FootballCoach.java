package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	@Autowired // for field injection - called reflection 
	@Qualifier("randomFortuneService")
	private FortuneService theFortuneService;

	@Override
	public String getDailyWorkout() {
		
		return "Practice ball passing between two players";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getDailyFortune();
	}

	//@Autowired - for setter injection 
	/*public void setTheFortuneService(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}
*/
}
