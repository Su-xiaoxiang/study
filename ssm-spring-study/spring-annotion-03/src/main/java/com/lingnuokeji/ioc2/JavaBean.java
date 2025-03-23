package com.lingnuokeji.ioc2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 15:10
 * @Version 1.0
 */
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JavaBean {

    @PostConstruct
    public void init(){
        System.out.println("加载");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }
}
