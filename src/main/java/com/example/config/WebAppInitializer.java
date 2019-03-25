package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		return new Class [] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		return new Class [] {SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("66666666666666666666666666666");
		return new String[] { "/"};
	}

	//extends AbstractAnnotationConfigDispatcherServletInitializer
}
