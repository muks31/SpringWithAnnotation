package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
//Note: if we don't specify the bean id(thatSillyCoach) 
//spring will create a default bean id that will be class name starts with lower case
@Component
public class TennisCoach implements Coach {
	
	private FortuneService theFortuneService;

	/**
	 * @param theFortuneService
	 */
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return theFortuneService.getDailyFortune();
	}

}
