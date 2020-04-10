package com.capgemini.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RadomFortuneService implements FortuneService {

	private String[] data = {"Welcome to my World","No pain no gain","Honesty is the best policy"};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index=myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
