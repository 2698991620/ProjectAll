package com.xja.test;

import com.xja.domain.Book;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookListTest {
    @Test
    public void test02(){
        ArrayList<String> strList = new ArrayList<>();
        String s = new String("abc");
        strList.add(s);
        System.out.println(strList.contains(s));

        String s1 = new String("abc");
        System.out.println(strList.contains(s1));
        System.out.println(strList.contains(new String("abc")));
    }

    @Test
    public void test01(){
        ArrayList<Book> bookList = new ArrayList();
        //先放三本书到集合中。
        Book book1 = new Book(1,"Java语言基础",100D);
        Book book2 = new Book(2,"Java面向对象",200D);
        Book book3 = new Book(3,"Java语言高级",300D);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

//        Collections.sort(bookList);
        //迭代
        for (Book book : bookList) {
            System.out.println(book);
        }

        System.out.println(bookList.contains(book2));//true
        System.out.println(bookList.contains(new Book(2,null,null)));

        System.out.println(bookList.indexOf(book2));
        System.out.println(bookList.indexOf(new Book(2,"Java面向对象",200D)));
    }
}
