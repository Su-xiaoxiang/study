package com.lingnuokeji.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/26 17:14
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.lingnuokeji")  // 替换为 Calculator 和相关组件所在的包路径
@EnableAspectJAutoProxy
public class JavaConfig {
}
