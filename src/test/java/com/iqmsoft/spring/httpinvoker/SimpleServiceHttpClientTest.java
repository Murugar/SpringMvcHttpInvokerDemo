package com.iqmsoft.spring.httpinvoker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iqmsoft.spring.httpinvoker.interfaces.SimpleService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-http-client.xml"})
public class SimpleServiceHttpClientTest extends SimpleServiceInProcessTest {

    @Autowired
    @Qualifier("httpRemotingHelloService")
    private SimpleService simpleService;

   // @Test
   // public void shouldGet200() throws Exception {
   //     String helloString = simpleService.sayHelloTo("Toy");
   //     assertThat(helloString, is("Hello: Toy"));
   // }
    
    @Test
    public void shouldGetWelcome200() throws Exception {
        String welcomeString = simpleService.sayWelcomeTo("Toy");
        assertThat(welcomeString, is("Welcome: Toy"));
    }    
    
}
