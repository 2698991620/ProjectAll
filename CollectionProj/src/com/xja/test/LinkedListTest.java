package com.xja.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public  void test01(){
        LinkedList<String> arrayList = new LinkedList<>();
        arrayList.add("Java语言基础");//0
        arrayList.add("Java面向对象");//1
        arrayList.add("Java语言高级");//2
        arrayList.add("Java语言高级");//3

        String s = arrayList.get(1);
        System.out.println(s);

        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());

        arrayList.remove(2);
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());

        int index = arrayList.indexOf(new Integer(1));
        System.out.println(index);

        System.out.println(arrayList.contains("Java语言高级"));
        System.out.println(arrayList.contains("Java"));
    }
}
