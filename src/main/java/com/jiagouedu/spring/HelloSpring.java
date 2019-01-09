package com.jiagouedu.spring;

/**
 * Created by Enzo Cotter on 2019/1/9.
 */
public class HelloSpring {
    private static String name;
    private static String sex;

    public HelloSpring(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }


    public static HelloSpring test() {
        System.out.println("your information: name: " + name + ", sex: " + sex);
        return new HelloSpring(name, sex);
    }
}
