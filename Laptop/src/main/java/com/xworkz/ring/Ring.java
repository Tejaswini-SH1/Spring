package com.xworkz.ring;

import java.lang.reflect.Modifier;

public class Ring extends AbstractAnnotationConfigDispatcherServletlnitializer {
    implements WebMvcConfigurer{
        public Ring(){
            System.out.println("constructor of ring class");
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





