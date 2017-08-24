package com.dhaval.baeldung;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Subject subject(){
		return new Subject(lesson());
	}
	
	@Bean(name="lesson")
	public Lesson lesson(){
		return new Lesson("Hello", "World");
	}
}
