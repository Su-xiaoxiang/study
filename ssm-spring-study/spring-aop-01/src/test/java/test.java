import com.lingnuokeji.Calculator;
import com.lingnuokeji.CalculatorImpl;
import com.lingnuokeji.config.JavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/26 17:15
 * @Version 1.0
 */
@SpringJUnitConfig(value = JavaConfig.class)
@RunWith(SpringRunner.class)
public class test {
    @Autowired
    private Calculator calculator;

    /**
     *
     */
    @Test
    public void test(){
        System.out.println(calculator.add(1,2));
    }

}