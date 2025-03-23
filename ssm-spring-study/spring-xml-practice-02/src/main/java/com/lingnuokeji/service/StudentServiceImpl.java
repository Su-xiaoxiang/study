package com.lingnuokeji.service;

import com.lingnuokeji.dao.StudentMapper;
import com.lingnuokeji.pojo.Student;

import java.io.IOException;
import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 9:07
 * @Version 1.0
 */
public class StudentServiceImpl implements StudentService {
    private StudentMapper studentMapper;
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }


    /**
     * 选择所有学生
     * 此方法用于从数据库中选择所有学生信息，并以列表形式返回
     * 它覆盖了接口或父类中的selectAll方法，以实现具体的学生信息查询逻辑
     *
     * @return 包含所有学生信息的列表如果数据库中没有学生信息，则返回空列表
     * @throws IOException 如果在读取数据库时发生I/O错误，则抛出此异常
     */
    @Override
    public List<Student> selectAll() throws IOException {
        List<Student> students = studentMapper.selectAll();
        return students;
    }
}
