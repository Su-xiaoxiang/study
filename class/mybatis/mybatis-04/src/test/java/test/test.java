package test;

import lingnuo.Mapper.empMapper;
import lingnuo.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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


    /**
     * 条件
     */
    @Test
    public void test() {
        //4.执行具体的SQL语句
        empMapper mapper = sqlSession.getMapper(empMapper.class);
        List<Emp> empList = mapper.selectAll("tom", 200.33);
        System.out.println(empList.toString());
    }
    @Test
    public void test2() {
        //4.执行具体的SQL语句
        empMapper mapper = sqlSession.getMapper(empMapper.class);
        List<Emp> empList = mapper.selectAll(null, 200.33);
        System.out.println(empList.toString());
    }
    @Test
    public void test3() {
        //4.执行具体的SQL语句
        empMapper mapper = sqlSession.getMapper(empMapper.class);
        Integer update = mapper.update(null, 500.21, 1);
        System.out.println(update);
    }

    /**
     * 批量查询
     */
    @Test
    public void testList() {
        //4.执行具体的SQL语句
        empMapper mapper = sqlSession.getMapper(empMapper.class);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        List<Emp> emps = mapper.selectByidList(integers);
        System.out.println(emps.toString());
    }

    /**
     * 批量删除
     */
    @Test
    public void deleteList() {
        //4.执行具体的SQL语句
        empMapper mapper = sqlSession.getMapper(empMapper.class);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        int num = mapper.delectById(integers);
        System.out.println(num);
    }

    /**
     * 批量增加
     */
    @Test
    public void insertList() {
        //4.执行具体的SQL语句
        empMapper mapper = sqlSession.getMapper(empMapper.class);
        ArrayList<Emp> emps = new ArrayList<>();
        Emp emp1 = new Emp(null, "牛瑞祥", 200.33);
        Emp emp2 = new Emp(null, "席博田", 300.44);
        emps.add(emp1);
        emps.add(emp2);
        int num = mapper.insertEmpList(emps);
        System.out.println("增加了"+num+"条数据");
    }
    @Test
    public void updateList() {
        //4.执行具体的SQL语句
        empMapper mapper = sqlSession.getMapper(empMapper.class);
        ArrayList<Emp> emps = new ArrayList<>();
        Emp emp1 = new Emp(3, "牛瑞祥", 200.33);
        Emp emp2 = new Emp(4, "席博田", 300.44);
        emps.add(emp1);
        emps.add(emp2);
        int num = mapper.updateBatch(emps);
        System.out.println("修改了"+num+"条数据");
    }
    @AfterEach
    public void after() {
     //5.关闭SqlSession对象
     sqlSession.commit();
     sqlSession.close();
        }
    }