package com.woniuxy.reflect.model;
@SuppressWarnings("all")
public class User {

    private String name; // Field对象
    protected int age; // Field对象
    boolean sex;
    public int no;
    public static final double MATH_PI = 3.141592653589793;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public static double getMathPi() {
        return MATH_PI;
    }

    public User() {
    }

    public User(String name, int age, boolean sex, int no) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.no = no;
    }

//    static {
//        System.out.println("静态代码块执行。");
//    }

}
