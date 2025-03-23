package com.lingnuokeji.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/31 15:34
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.lingnuokeji")
@ImportResource("classpath:spring-01.xml")
public class JavaConfig {

}
