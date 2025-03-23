import com.lingnuokeji.JavaBean;
import com.lingnuokeji.JavaConfig1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/26 16:05
 * @Version 1.0
 */
@SpringJUnitConfig(value = {JavaConfig1.class})
@RunWith(SpringRunner.class)
public class test1 {
    @Autowired
     private JavaBean javaBean;
    @Test
    public void test(){
        javaBean.sayHello();
    }
}
