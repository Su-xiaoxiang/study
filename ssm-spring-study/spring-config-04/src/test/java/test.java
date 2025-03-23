import com.lingnuokeji.JavaBean;
import com.lingnuokeji.JavaConfig1;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/26 14:30
 * @Version 1.0
 */
public class test {
    @Test
    public void test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig1.class);
        JavaBean javaBean = annotationConfigApplicationContext.getBean("javaBean", JavaBean.class);
        javaBean.sayHello();
        System.out.println(javaBean);
    }
}
