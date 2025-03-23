import com.lingnuokeji.contoller.StudentController;
import com.lingnuokeji.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 19:48
 * @Version 1.0
 */
public class test1 {
    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        StudentController studentController = classPathXmlApplicationContext.getBean("studentController", StudentController.class);
        List<Student> students = studentController.selectAll();
        System.out.println(students);
    }
}