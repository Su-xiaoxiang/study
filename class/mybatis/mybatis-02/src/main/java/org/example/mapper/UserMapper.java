package org.example.mapper;

import org.example.pojo.user;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/26 10:55
 * @Version 1.0
 */
public interface UserMapper {
    void insertUser(user user);
    user selectUserById(int id);
    void updateUser(user user);
}
