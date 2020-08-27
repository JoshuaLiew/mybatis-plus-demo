package com.woniuxy.reflect.model;

public class User {

    private String name; // Field对象
    protected int age; // Field对象
    boolean sex;
    public int no;
    public static final double MATH_PI = 3.141592653589793;
    static {
        System.out.println("静态代码块执行。");
    }
}
