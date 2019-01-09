package com.spring;

import com.jiagouedu.spring.HelloSpring;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Enzo Cotter on 2019/1/9.
 */
public class IocTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.getBean("factoryBean");
    }
}
