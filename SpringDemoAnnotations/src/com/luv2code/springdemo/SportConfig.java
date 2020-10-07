package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:Sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService funnyFortuneService() {
		return new FunnyFortuneService();
	}
	
	@Bean
	public Coach yogaCoach() {
		return new YogaCoach(funnyFortuneService());
	}

}
