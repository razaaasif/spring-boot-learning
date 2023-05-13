package com.example.demo.interfacesImpl;

import org.springframework.stereotype.Component;

import com.example.demo.interfaces.Coach;

@Component
public class BaseBallCoach implements Coach {
	
	public BaseBallCoach() {
		System.out.println("In Constructor: " + this.getClass().getSimpleName());
	}
	@Override
	public String getDialyWorkout() {
		// TODO Auto-generated method stub
		return "BaseBallCoach: Spent 30 minutes in baseball";
	}

}
