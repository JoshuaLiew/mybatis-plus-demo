package com.woniuxy.genericity;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    /**
     * 泛型
     */
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("123");
        arr.add("456");
        arr.add("789");
        showAray(arr);
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        showAray(arr1);
    }

    public static <T> void showAray(List<T> arr){

        System.out.println(arr);
    }
}
