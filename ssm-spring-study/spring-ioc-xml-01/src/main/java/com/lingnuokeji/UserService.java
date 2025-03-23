package com.lingnuokeji;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/19 14:27
 * @Version 1.0
 */
public class UserService {
    public UserService(UserDao userDao, int age, String name) {
        this.userDao = userDao;
        this.age = age;
        this.name = name;
    }

    private UserDao userDao;
    private int age;
    private String name;

    public  UserService(UserDao userDao) {
        this.userDao = userDao;
    }
}
