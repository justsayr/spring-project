package com.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class [] {SpringConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class [] {SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/"};
	}

	//extends AbstractAnnotationConfigDispatcherServletInitializer
}
