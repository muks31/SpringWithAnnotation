package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LudoConfig {
	
	@Bean
	@Qualifier
	public FortuneService RESTFortuneService() {
		return new RESTFortuneService();
	}
	
	
	@Bean
	public Coach ludoCoach() {
		return new LudoCoach();
	}

}
