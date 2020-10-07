package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SwimCoach sCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(sCoach.getDailyFortune());
		System.out.println(sCoach.getDailyWorkout());
		System.out.println(sCoach.getEmail());
		System.out.println(sCoach.getTeam());
		System.out.println(sCoach.getAge());
		
		context.close();
	}

}
