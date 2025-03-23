package com.lingnuokeji.dio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 15:33
 * @Version 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void work(){
        userService.study();
    }
}
