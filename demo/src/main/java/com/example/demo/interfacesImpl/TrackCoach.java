package com.example.demo.interfacesImpl;

import org.springframework.stereotype.Component;

import com.example.demo.interfaces.Coach;

@Component
public class TrackCoach implements Coach {
	public TrackCoach() {
		System.out.println("In Constructor: " + this.getClass().getSimpleName());
	}

	@Override
	public String getDialyWorkout() {
		// TODO Auto-generated method stub
		return "Run on a track";
	}

}
