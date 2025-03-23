package com.lingnuokeji.service;

import com.lingnuokeji.pojo.Student;

import java.io.IOException;
import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 19:34
 * @Version 1.0
 */
public interface StudentService {
    List<Student> selectAll() throws IOException;
}
