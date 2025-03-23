package com.lingnuokeji.dio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 15:54
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired // 自动注入
    private UserMapper userMapper;

    @Override
    public void study() {
        userMapper.work();
    }
}
