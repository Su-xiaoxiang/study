package com.lingnuokeji.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/31 14:58
 * @Version 1.0
 */
@Repository
public class StudentDao {
    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateNameById(int id, String name) {
        String sql = "update user set name = ? where id = ?";
        jdbcTemplate.update(sql, name, id);
    }
    public void updateAgeById(int id, int age) {
        String sql = "update user set age = ? where id = ?";
        jdbcTemplate.update(sql, age, id);
    }
}
