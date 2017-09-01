package com.dhaval.baeldung.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.dhaval.baeldung.Subject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = TestConfig.class)
public class SetterDIAnnotationIntegrationTest {

    @Test
    public void givenSetterDI_whenAnnotationConfig_thenExecuteBeginStudy() {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        Subject sub = context.getBean(Subject.class);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        sub.beginStudy();

        String expectedOutput = "We are learning Setter DI using Annotations.";

        assertEquals(expectedOutput, outContent.toString());

        context.close();
    }

}
