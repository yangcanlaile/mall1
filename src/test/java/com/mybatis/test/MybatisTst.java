package com.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.apache.ibatis.io.Resources.getResourceAsStream;

public class MybatisTst {
//    @Test
//    public void test1() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        SqlSession session = sqlSessionFactory.openSession();
//        try {
//            User user = (User) session.selectOne("org.mybatis.example.UserMapper.selectUser", 2);
//            System.out.println("user's info:" + (user != null ? user.toString() : null));
//        } finally {
//            session.close();
//        }
//    }
//
//    @Test
//    public void test2() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        SqlSession session = sqlSessionFactory.openSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//        User user = mapper.selectByPrimaryKey(1);
//        System.out.println("user info: " + user);
//
//    }
}




