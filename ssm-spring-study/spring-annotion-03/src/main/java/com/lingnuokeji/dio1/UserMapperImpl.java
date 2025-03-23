package com.lingnuokeji.dio1;

import org.springframework.stereotype.Repository;

/**
* @UserName 程序员_Suxiaoxiang
* @date 2024/10/24 15:55
* @Version 1.0
*/
@Repository
public class UserMapperImpl  implements UserMapper {
    @Override
    public void work() {
        System.out.println("张三正在创建数据库");
    }
}
