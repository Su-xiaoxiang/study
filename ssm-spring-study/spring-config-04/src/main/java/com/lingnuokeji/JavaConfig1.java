package com.lingnuokeji;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/26 14:34
 * @Version 1.0
 */
@ComponentScan(basePackages = {"com.lingnuokeji"})
@Configuration
@Import({JavaConfig2.class})
public class JavaConfig1 {

}
