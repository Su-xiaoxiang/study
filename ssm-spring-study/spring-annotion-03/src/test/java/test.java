import com.lingnuokeji.dio1.UserController;
import com.lingnuokeji.dio2.JavaBean2;
import com.lingnuokeji.ioc1.CommonComponent;
import com.lingnuokeji.ioc2.JavaBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 14:41
 * @Version 1.0
 */
public class test {
    @Test
    public void test() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        CommonComponent commonComponent = classPathXmlApplicationContext.getBean("commonComponent", CommonComponent.class);
        System.out.println(commonComponent);
    }
    @Test
    public void test2() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        JavaBean javaBean = classPathXmlApplicationContext.getBean("javaBean", JavaBean.class);
        JavaBean javaBean1 = classPathXmlApplicationContext.getBean("javaBean", JavaBean.class);
        System.out.println(javaBean == javaBean1);
    }
    @Test
    public void test3() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-03.xml");
        UserController userController = classPathXmlApplicationContext.getBean("userController", UserController.class);
        userController.work();
    }
    @Test
    public void test4(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-04.xml");
        JavaBean2 javaBean2 = classPathXmlApplicationContext.getBean("javaBean2", JavaBean2.class);
        System.out.println(javaBean2);
    }
}
