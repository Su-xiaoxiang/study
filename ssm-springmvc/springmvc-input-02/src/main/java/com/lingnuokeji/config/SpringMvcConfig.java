package com.lingnuokeji.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/7 8:56
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.lingnuokeji")
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {
}
