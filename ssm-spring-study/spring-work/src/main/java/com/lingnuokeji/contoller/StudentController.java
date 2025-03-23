package com.lingnuokeji.contoller;

import com.lingnuokeji.pojo.Student;
import com.lingnuokeji.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.io.IOException;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 19:36
 * @Version 1.0
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    public List<Student> selectAll() throws IOException {
        List<Student> students = studentService.selectAll();
        return students;
    }
}
