package com.lingnuokeji.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/26 17:04
 * @Version 1.0
 */
@Component
@Aspect
@Order(1)
public class LogAdvice {
    // 提取公共切点表达式
    @Pointcut("execution(* com.lingnuokeji.*.*(..))")
    public void pc(){}


    @Before(value = "pc()")
    public void start(JoinPoint joinPoint){
        // 获取方法所属类的信息
        String className = joinPoint.getTarget().getClass().getName();
        // 获取方法名
        String methodName = joinPoint.getSignature().getName();
        // 获取方法参数
        Object[] args = joinPoint.getArgs();
        /*System.out.println("访问修饰符"+joinPoint.getSignature().getModifiers());
        System.out.println("类名"+className);
        System.out.println("方法名"+methodName);
        System.out.println("参数"+ Arrays.toString(args));
        System.out.println("LogAdvice before");*/
    }
    @After(value = "pc()")
    public void afterReturning(){
        System.out.println("LogAdvice afterReturning");
    }
    @AfterThrowing(value = "pc()")
    public void afterThrowing(){
        System.out.println("LogAdvice afterThrowing");
    }

}
