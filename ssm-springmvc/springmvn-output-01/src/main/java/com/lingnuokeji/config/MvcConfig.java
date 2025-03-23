package com.lingnuokeji.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/7 15:15
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.lingnuokeji")
public class MvcConfig implements WebMvcConfigurer {

    // 设置 JSP 视图解析器（如果需要的话，取消注释）
     @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        // 自定义请求映射处理器映射规则
        return new RequestMappingHandlerMapping();
    }
    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
         // 自定义请求映射处理器适配器
        return new RequestMappingHandlerAdapter();
    }
    // 设置 JSON 转换器
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter());
    }
    // 启用默认的 servlet 处理（例如用于静态资源）
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
