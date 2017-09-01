package com.dhaval.baeldung.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dhaval.baeldung.Lesson;
import com.dhaval.baeldung.Subject;

@Configuration
public class TestConfig {

    @Bean
    public Subject subject() {
        return new Subject(lesson());
    }

    @Bean(name = "lesson")
    public Lesson lesson() {
        return new Lesson("BDD", "Testing");
    }
}
