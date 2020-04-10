package com.capgemini.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("radomFortuneService")
	private FortuneService fortuneService;
	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService=theFortuneService; }
	 */

	public TennisCoach() {
		System.out.println("Inside the default constructor");
	}

//	@Autowired
//	public void crazyFortuneService(FortuneService theFortuneService) {
//		System.out.println("Inside the crazy");
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void domyStartupStuff() {
		System.out.println("TennisCoach: inside of domyStartupStuff");
	}
	
	@PreDestroy
	public void domyCleaupStuff() {
		System.out.println("TennisCoach: inside of domyCleaupStuff");
	}

}
