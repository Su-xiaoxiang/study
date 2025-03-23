package com.lingnuokeji.service;

import com.lingnuokeji.mapper.StudentMapper;
import com.lingnuokeji.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 19:35
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public  List<Student> selectAll() throws IOException {
        List<Student> students = studentMapper.selectAll();
        return students;
    }
}
