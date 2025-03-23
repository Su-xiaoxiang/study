package com.lingnuokeji.controller;

import com.lingnuokeji.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/7 9:30
 * @Version 1.0
 */
@Controller
@RequestMapping("param")
@ResponseBody
public class ParamController {
     @GetMapping("/data")
    public String data(@RequestParam("name") String name, @RequestParam("age") String age){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        return "success";
    }
    @GetMapping("/data1")
    public String data1(@RequestParam(value = "name") String uname,
                        @RequestParam(value = "age", required = false ,defaultValue = "18") String age){
        System.out.println("name: " + uname);
        System.out.println("age: " + age);
        return "success";
    }


    @GetMapping("/data2")
    public String data2(@RequestParam List<String> hbs){
         System.out.println("hbs: " + hbs);
         return "success";
    }
    @GetMapping("/data3")
    public String data3(user user){
        System.out.println("user: " + user);
        return "success";
    }
    @GetMapping("/data4/{id}/{uname}")
    public String data4(@PathVariable Long id, @PathVariable(value = "uname") String name)
        {
            System.out.println("id: " + id);
            System.out.println("name: " + name);
            return "success";
        }
}
