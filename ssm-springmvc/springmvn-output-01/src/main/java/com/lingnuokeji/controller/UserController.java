package com.lingnuokeji.controller;


import com.lingnuokeji.pojo.User;
import jakarta.ws.rs.PUT;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/7 15:27
 * @Version 1.0
 */
@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {

    /*@RequestMapping("/index")
    public String index(HttpServletRequest request){
        request.setAttribute("data","Suxiaoxiang");
        return "index";
    }


    @RequestMapping("forward")
    public String forward(){
        return "forward:/index";
    }

    @RequestMapping("redirect")
    public String redirect(){
        return "redirect:https://lingnuo.top";
    }*/
    //1.保存用户信息
    @PostMapping("saveUser")
    public String saveUser(@RequestBody User user){
        System.out.println(user);
        return "success";
    }
    @GetMapping("/{id}")
    public User querryUser(@PathVariable Integer id){
        User user = new User();
        user.setId(id);
        user.setName("Suxiaoxiang");
        user.setAge(25);
        return user;
    }
    @DeleteMapping("/user/{id}")
    public int deleteUser( @PathVariable Integer id){
        System.out.println("delete user id: "+id);
        return 1;
    }
    @PutMapping("/user/{id}")
    public int updateUser(@PathVariable Integer id, @RequestBody User user){
        System.out.println("update user id: "+id);
        System.out.println(user);
        return 1;
    }
}
