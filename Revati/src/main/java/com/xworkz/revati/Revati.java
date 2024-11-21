package com.xworkz.revati;

public class Revati extends AbstractAnnotationConfigDispatcherServletInitializer
        implements WebMvcConfigurer {
        public  Revati (){
            System.out.println("constructor of revati class ");
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
            System.out.println("Created getServletMappings ");
            return urls;
        }

        @Override
        public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
            System.out.println("created configureDefaultServletHandling");
            configurer.enable();

        }



}

