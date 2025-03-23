package com.lingnuokeji;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/26 14:29
 * @Version 1.0
 */
@Aspect
@Component
public class JavaBean {

    @Value("${spring.username}")
    private String username;
    @Value("${spring.password}")
    private String password;

    @Override
    public String toString() {
        return "JavaBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void sayHello(){
        System.out.println("Hello World!");
    }
}
