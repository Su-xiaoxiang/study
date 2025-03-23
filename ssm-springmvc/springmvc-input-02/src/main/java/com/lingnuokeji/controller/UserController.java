package com.lingnuokeji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/7 8:30
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @RequestMapping("/login")
    public String  login(){
        System.out.println("用户登录");
        return "login success";
    }

    @RequestMapping("/register")
    public String register(@RequestBody String name){
        System.out.println("用户注册"+name);
        return "register success";
    }
}
