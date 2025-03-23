package com.lingnuokeji.controller;

import com.lingnuokeji.pojo.Student;
import com.lingnuokeji.service.StudentService;

import java.io.IOException;
import java.util.List;
/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 9:12
 * @Version 1.0
 */
public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
        public List<Student> findAll() throws IOException {
        return studentService.selectAll();
        }
}
