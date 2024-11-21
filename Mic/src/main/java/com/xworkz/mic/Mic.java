package com.xworkz.mic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

    public class Mic extends AbstractAnnotationConfigDispatcherServletInitializer{
            implements WebMvcConfigurer {
        public  Mic (){
            System.out.println("constructor of Mic class ");
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
