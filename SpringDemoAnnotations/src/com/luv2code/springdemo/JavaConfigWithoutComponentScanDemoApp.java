package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigWithoutComponentScanDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		YogaCoach yCoach = context.getBean("yogaCoach",YogaCoach.class);
		
		System.out.println(yCoach.getDailyFortune());
		System.out.println(yCoach.getDailyWorkout());
		System.out.println(yCoach.getTeam());
		System.out.println(yCoach.getEmail());
		context.close();
		

	}

}
