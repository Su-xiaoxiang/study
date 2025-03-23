package com.lingnuokeji.dao;

import com.lingnuokeji.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/24 8:42
 * @Version 1.0
 */
public class StudentMapperimpl implements StudentMapper {
    @Override
    public List<Student> selectAll() throws IOException {
        //1.读取外部配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3.创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行查询
        List<Student> students = sqlSession.selectList("com.lingnuokeji.dao.StudentMapper.selectAll");
        //5.关闭SqlSession对象
        sqlSession.close();
        return students;
    }
}
