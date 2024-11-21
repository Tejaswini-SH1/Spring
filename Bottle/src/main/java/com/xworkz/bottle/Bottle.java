package com.xworkz.bottle;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Practice extends AbstractAnnotationConfigDispatcherServletInitializer{
        implements WebMvcConfigurer {
    public  Bottle (){
        System.out.println("constructor of bottle class ");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];

    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        String[] urls={"/"};
        System.out.println("Created getServletMappings ");
        return urls;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("created configureDefaultServletHandling");
        configurer.enable();

    }
}
}

