package com.lingnuokeji.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvclnit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0]; // 不需要根配置类
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class}; // 指定SpringMvcConfig作为配置类
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // 将所有请求交给Spring处理
    }
}
