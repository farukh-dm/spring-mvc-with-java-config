package com.learn.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebDotXmlInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		//return new Class[] { MvcConfiguration.class  };
	
		return new Class[] { MyAppMvcConfiguration.class  };
	
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
	
		return new String[] { "/" };
	
	}


}
