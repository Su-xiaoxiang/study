package com.lingnuo.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lingnuo.Mapper.empMapper;
import org.lingnuo.pojo.Emp;
import org.lingnuo.pojo.EmpRestultMap;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/9/19 15:02
 * @Version 1.0
 */
public class test {
    private SqlSession sqlSession;

    @BeforeEach
    public void before() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.`SqlSession`对象，用于执行具体的SQL语句
        sqlSession = sqlSessionFactory.openSession();
    }
    @Test
    public void test () {
        //4.执行具体的SQL语句
        empMapper mapper = sqlSession.getMapper(empMapper.class);
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp.toString());
        //5.关闭SqlSession对象
        sqlSession.commit();
        sqlSession.close();
    }
        @AfterEach
        public void after() {
            //5.关闭SqlSession对象
            sqlSession.commit();
            sqlSession.close();
        }
    }