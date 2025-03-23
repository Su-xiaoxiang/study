import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.CustomerMapper;
import org.example.mapper.OrderMapper;
import org.example.pojo.Customer;
import org.example.pojo.Order;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/28 15:56
 * @Version 1.0
 */
public class test1 {
    private SqlSession sqlSession;
    @BeforeEach
    public void before() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.`SqlSession`对象，用于执行具体的SQL语句
        sqlSession = sqlSessionFactory.openSession();
    }
    @Test
   public void test() {
        //4.执行具体的SQL语句
       OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
       Order order = mapper.queryOrdersByUserId(1);
       System.out.println("订单信息"+order.getCustomer().getCustomerName());
        System.out.println("顾客信息"+order.getCustomer());
   }
   @Test
   public void test2() {
        //4.执行具体的SQL语句
       CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
       List<Customer> customers = mapper.selectAll(1);
       for (Customer customer : customers){
           System.out.println("顾客信息："+customer.getCustomerName());
           System.out.println("订单信息："+customer.getOrderList());
       }
   }
    @AfterEach
    public void after() {
        //5.关闭SqlSession对象
        sqlSession.commit();
        sqlSession.close();
    }
}
