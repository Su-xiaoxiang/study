package com.lingnuokeji;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/31 11:19
 * @Version 1.0
 */
@Component
@Aspect
@Order(2)
public class TxAroundAdvice {
      @Around("com.lingnuokeji.Ann.pc()")
      public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            Object[] args = joinPoint.getArgs();
            System.out.println("事务开始...");
            Object proceed = joinPoint.proceed(args);
            System.out.println("事务结束...");
            return proceed;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("最终执行");
        }
    }
}
