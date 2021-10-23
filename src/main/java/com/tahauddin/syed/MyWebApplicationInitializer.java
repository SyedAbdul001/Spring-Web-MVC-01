package com.tahauddin.syed;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 
 * @author Syed Tahauddin
 *
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// 3 steps
		
		// 1. create object of container
		AnnotationConfigWebApplicationContext container = 
				new AnnotationConfigWebApplicationContext();
		container.register(MOCUtil.class);
		
		//2. create dispatcher servlet object
		// pass the container as parametor
		DispatcherServlet dispatcherServlet = new DispatcherServlet(container);
		
		//3. add it to servlet context object
		// make sure we add servlet api version 2.5+
		// orelse it will not work.
		// i have added servlet api version 4.0.1
		Dynamic dynamic = servletContext.addServlet("dispatcherServlet", dispatcherServlet);
		
		// add mapping
		dynamic.addMapping("/");
		
		// create object whenever application is deployed on server.
		dynamic.setLoadOnStartup(1);
	}

}
