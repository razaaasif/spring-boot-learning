package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.interfaces.Coach;
import com.example.demo.interfacesImpl.SwimCoach;

@Configuration
public class BeanConfiguration {
	@Bean(destroyMethod = "clean" , initMethod = "init")
	public Coach swimCoach() {
		SwimCoach coach = new SwimCoach();
		coach.init();
		return coach;
				
	}
}
