package com.spring;

import com.jiagouedu.spring.HelloSpring;
import com.jiagouedu.spring.MethodInject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Enzo Cotter on 2019/1/9.
 */
public class IocTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        MethodInject mj = (MethodInject) ctx.getBean("methodInject");
        mj.getFine().test();

    }
}
