package com.example.demo.interfacesImpl;

import org.springframework.stereotype.Component;

import com.example.demo.interfaces.Coach;

//component mark the class as spring bean
@Component
public class CricketCoach implements Coach {
	public CricketCoach() {
		System.out.println("In Constructor: " + this.getClass().getSimpleName());
	}

	@Override
	public String getDialyWorkout() {
		return "CricketCoach : Practice fast bowling for 15. ";
	}

}
