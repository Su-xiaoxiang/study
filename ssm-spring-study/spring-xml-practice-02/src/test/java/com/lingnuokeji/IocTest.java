package com.lingnuokeji;

import com.lingnuokeji.controller.StudentController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 9:29
 * @Version 1.0
 */
public class IocTest {
    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        StudentController studentController = classPathXmlApplicationContext.getBean("studentController", StudentController.class);
        System.out.println(studentController.findAll());
    }
}
