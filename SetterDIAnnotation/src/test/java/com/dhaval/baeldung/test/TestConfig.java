package com.dhaval.baeldung.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dhaval.baeldung.Lesson;
import com.dhaval.baeldung.Subject;

@Configuration
public class TestConfig {

    @Bean(name = "subject")
    public Subject subject() {
        Subject sub = new Subject();
        sub.setLesson(lesson());
        return sub;
    }

    @Bean(name = "lesson")
    public Lesson lesson() {
        Lesson les = new Lesson();
        les.setMessage1("BDD Testing");
        return les;
    }
}
