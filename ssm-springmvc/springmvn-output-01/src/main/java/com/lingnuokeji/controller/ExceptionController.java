package com.lingnuokeji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/9 16:25
 * @Version 1.0
 */
@Controller
@RequestMapping("epc")
@ResponseBody
public class ExceptionController {
    @RequestMapping("test")
    public String test() {
        String name = null;
        System.out.println(name.length());
        return "success";
    }
    @RequestMapping("test2")
    public String test2() {
        int[] arr = new int[5];
        arr[6] = 10;
        return "success";
    }
}
