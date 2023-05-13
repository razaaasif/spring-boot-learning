package com.example.demo.interfacesImpl;

import com.example.demo.interfaces.Coach;

public class SwimCoach implements Coach {

	public SwimCoach() {
		System.out.println("In COnstructor : " + getClass().getSimpleName());
	}

	public void init() {
		System.out.println("In init");
	}
	@Override
	public String getDialyWorkout() {
		return "SwimCoach: swim daily for 30 minutes.";
	}

}
