package com.woniuxy.reflect.demo1;

import com.woniuxy.reflect.model.User;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldDemo1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //
        Class c1 = User.class;
        Class c2 = Class.forName("com.woniuxy.reflect.model.User"); // .forName方法会导致类加载，会执行类中的静态代码块
        Class c3 = new User().getClass();

//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);


        Field[] fields = c1.getFields();    //public
        Field[] fields1 = c1.getDeclaredFields();   //所有的
        for (Field field : fields1) {
            System.out.println(field.getName());    //  获取属性名
            System.out.println(field.getType().getSimpleName());    //  获取属性数据类型名
            System.out.println(Modifier.toString(field.getModifiers()));   //获取修饰符

            System.out.println("-----------------------");
        }

        //反编译类的属性
        StringBuilder sb = new StringBuilder();
        sb.append(Modifier.toString(c1.getModifiers()) + "class" + c1.getSimpleName() + "{\n");
        for (Field field : c1.getDeclaredFields()) {
            sb.append("\t" + Modifier.toString(field.getModifiers())+ " " + field.getType().getSimpleName()+ " "  + field.getName() + ";\n");
        }

        sb.append("}");
        System.out.println(sb);

    }
}
