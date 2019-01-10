package com.jiagouedu.spring;

public abstract class MethodInject {
    public void handlerRequest(){

        getFine();
    }
    public abstract FineSpring  getFine();
}
