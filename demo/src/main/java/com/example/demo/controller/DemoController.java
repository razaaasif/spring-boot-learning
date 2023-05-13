package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.Coach;

@RestController
public class DemoController {
	private Coach coach;
	
	@Autowired
	public  DemoController(@Qualifier("swimCoach")	Coach theCoach) {
		this.coach = theCoach;
	}
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {return this.coach.getDialyWorkout();}
}
