package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KabbadiConfig {
	
	@Bean
	@Qualifier
	public FortuneService randomeFortuneService()
	{
		return new RandomFortuneService();
	}
	
	@Bean
	public Coach kabbadiCoach() {
		return new KabbadiCoach();
	}

}
