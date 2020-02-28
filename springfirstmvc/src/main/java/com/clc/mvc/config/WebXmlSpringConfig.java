package com.clc.mvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class WebXmlSpringConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
	AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	context.register(SpringBeanConfig.class);
	context.setServletContext(servletContext);
	ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	
	}
}
