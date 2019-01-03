package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Happy 5k Running";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		
		return fortuneService.getFortune();
	}
}
