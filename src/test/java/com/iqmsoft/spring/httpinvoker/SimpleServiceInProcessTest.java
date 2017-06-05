package com.iqmsoft.spring.httpinvoker;

import org.junit.Before;
import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;
import org.springframework.web.servlet.DispatcherServlet;


public abstract class SimpleServiceInProcessTest {

    @Before
    public void setUp() throws Exception {
    	
        Server server = new Server();
        SelectChannelConnector connector = new SelectChannelConnector();
        connector.setPort(9000);
        server.setConnectors(new Connector[] {connector});

        Context context = new Context(server, "/", Context.SESSIONS);

        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.setContextConfigLocation("classpath:/spring-servlet.xml");

        ServletHolder servletHolder = new ServletHolder(dispatcherServlet);
        context.addServlet(servletHolder, "/*");
        server.start();
    }

}
