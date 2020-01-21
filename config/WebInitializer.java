package com.niit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@Configuration
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

 @Override
    protected Class[] getRootConfigClasses() {
        return new Class[] {HibernateConfig.class };
    }
  
    @Override
    protected Class[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/" };
    }

}
