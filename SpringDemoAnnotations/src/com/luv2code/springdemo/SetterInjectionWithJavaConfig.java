package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterInjectionWithJavaConfig {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LudoConfig.class);
		
		LudoCoach lCoach = context.getBean("ludoCoach",LudoCoach.class);
		
		System.out.println(lCoach.getDailyWorkout());
		System.out.println(lCoach.getDailyFortune());
		
		context.close();

	}

}
