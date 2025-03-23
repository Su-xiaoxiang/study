package test;

import com.lingnuokeji.config.JavaConfig;
import com.lingnuokeji.serivce.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/31 15:52
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JavaConfig.class})
public class TeTest {
    @Autowired
    private StudentService studentService;
    @Test
    public void test(){
        studentService.changeStudentInfo();
    }
}
