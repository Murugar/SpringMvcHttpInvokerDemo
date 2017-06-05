package com.iqmsoft.spring.httpinvoker;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iqmsoft.spring.httpinvoker.interfaces.SimpleService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class SimpleServiceTest {

    @Test
    public void shouldGetHelloWorld() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-http-config.xml");
        SimpleService simpleService = (SimpleService) context.getBean("simpleService");

        String hello = simpleService.sayHelloTo("Grande");
        assertThat(hello, is("Hello: Grande"));
        
        String welcome = simpleService.sayWelcomeTo("Williams");
        assertThat(welcome, is("Welcome: Williams"));
        
    }
}
