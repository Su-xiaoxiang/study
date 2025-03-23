package com.lingnuokeji;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/31 14:03
 * @Version 1.0
 */
@Component
@Aspect
public class Ann {
    @Pointcut("execution(* com.lingnuokeji.*.*(..))")
    public void pc(){}

}
