package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of strings
	String[] data = {"Today is your lucky day!", 
			"You're going to achieve great in life", 
			"Thing will change for good in your life"};
	
	

	//create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getDailyFortune() {
		
		//pick a random string from array
		int index = myRandom.nextInt(data.length);
		String fortune = data[index];
		
		return fortune;
	}

}
