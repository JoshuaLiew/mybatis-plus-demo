package com.woniuxy.annotation;

public class Test {

    int no;
    String name;


    @AnnoDemo1
    public void getname (){

    }

    @Override
    public String toString() {
        return "Test{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
