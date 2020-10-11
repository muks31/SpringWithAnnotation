package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FeildInjectionWithJavaConfiguration {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KabbadiConfig.class);
		
		KabbadiCoach kCoach = context.getBean("kabbadiCoach",KabbadiCoach.class);
		
		System.out.println(kCoach.getDailyWorkout());
		System.out.println(kCoach.getDailyFortune());
		
		context.close();

	}

}
