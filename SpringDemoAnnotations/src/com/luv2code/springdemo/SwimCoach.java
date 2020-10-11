package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
    @Autowired
    @Qualifier("happyFortuneService")
	private FortuneService theFortuneService;
    
    //@Value("mukeshraidixit@gmail.com")
    @Value("${email}")
    private String email;
    
    //@Value("Sunrisers Hyderabad")
    @Value("${team}")
    private String team;
    
    @Value("24")
    private int age;
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Swim 500 meter in a rep of three";
	}

	@Override
	public String getDailyFortune() {
		
		return theFortuneService.getDailyFortune();
	}

	public int getAge() {
		return age;
	}
	
	
	//Use Constructor to Inject Literal Value with Value Annotation 
	 @Autowired
		public SwimCoach(@Value("mkr@gmail.com")String email, @Value("ChennaiSuperKings")String team, @Value("25")int age) {
			this.email = email;
			this.team = team;
			this.age = age;
		}
	


}
