package com.tahauddin.syed;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * 
 * @author Syed Tahauddin
 *
 */
@ComponentScan(basePackages = "com.tahauddin.syed")
@EnableWebMvc
public class MOCUtil {

	
	/**
	 * this is using lambda expression
	 * calling onStartup() of WebApplicationInitializer interface.
	 * 
	 */
	/*
	WebApplicationInitializer webApplicationInitializer =

			servletContext -> {
			
				// 1. create object of container
				AnnotationConfigWebApplicationContext container = new AnnotationConfigWebApplicationContext();
				container.register(MOCUtil.class);

				// 2. create dispatcher servlet object
				// pass the container as parametor
				DispatcherServlet dispatcherServlet = new DispatcherServlet(container);

				// 3. add it to servlet context object
				// make sure we add servlet api version 2.5+
				// orelse it will not work.
				// i have added servlet api version 4.0.1
				Dynamic dynamic = servletContext.addServlet("dispatcherServlet", dispatcherServlet);

				// add mapping
				dynamic.addMapping("/");

				// create object whenever application is deployed on server.
				dynamic.setLoadOnStartup(1);
			};

	 */
}
