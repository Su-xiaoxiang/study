package com.lingnuokeji.controller;

import com.lingnuokeji.pojo.Person;
import jakarta.ws.rs.PUT;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/7 16:52
 * @Version 1.0
 */
@RestController
public class JsonController {
     @RequestMapping("json")
    public Person json(){
         Person person = new Person();
         person.setName("Suxiaoxiang");
         person.setAge(24);
         person.setGender("男");
         return person;
     }
}
