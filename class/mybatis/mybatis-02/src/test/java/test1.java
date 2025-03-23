import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.UserMapper;
import org.example.pojo.user;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/26 10:59
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
    public void test() throws IOException {
        //4.执行具体的SQL语句
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        user user = new user();
        user.setId(4);
        user.setUsername("李宇博");
        user.setPassword("123456");
        mapper.insertUser(user);
    }
    @Test
    public void test2() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        user user = mapper.selectUserById(1);
        System.out.println(user);
    }
    @Test
    public void test3() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        user user = new user();
        user.setId(2);
        user.setUsername("abo");
        user.setPassword("12345622");
        mapper.updateUser(user);
    }
    @AfterEach
    public void after() {
        //5.关闭SqlSession对象
        sqlSession.commit();
        sqlSession.close();
    }
}
