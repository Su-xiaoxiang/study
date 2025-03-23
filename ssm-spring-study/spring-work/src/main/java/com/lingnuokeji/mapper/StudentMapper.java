package com.lingnuokeji.mapper;

import com.lingnuokeji.pojo.Student;

import java.io.IOException;
import java.util.List;
/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 19:36
 * @Version 1.0
 */
public interface StudentMapper {
    List<Student> selectAll() throws IOException;
}
