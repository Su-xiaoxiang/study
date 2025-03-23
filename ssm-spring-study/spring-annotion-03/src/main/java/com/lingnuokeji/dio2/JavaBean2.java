package com.lingnuokeji.dio2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 17:20
 * @Version 1.0
 */
@Component
public class JavaBean2
{
    private int age=18;
    @Value("张三")
    private String name;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Override
    public String toString() {
        return "JavaBean2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
