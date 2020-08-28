package com.woniuxy.reflect.demo1;

import com.woniuxy.reflect.model.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodDemo1 {
    public static void main(String[] args) throws Exception {
        Class c1 = User.class;
        Object user = c1.newInstance();
//        for (Method method : c1.getDeclaredMethods()) {
//            System.out.print(Modifier.toString(method.getModifiers()) + " ");
//            System.out.println(method.getName());
//
//        }

        Method method = c1.getMethod("setNo",int.class);

        method.invoke(user,2);

        Field field = c1.getDeclaredField("no");

        Object no = field.get(user);

        System.out.println(no);

        Class c2 = c1.getSuperclass();


        System.out.println(c2.getName());


    }
}
