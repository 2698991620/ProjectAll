package com.xja.test;

import com.xja.domain.Book;
import org.junit.Test;

import java.util.ArrayList;

public class BookTest {
    private ArrayList<Book> bookList = new ArrayList<>();
    @Test
    public void test01(){
        Book b1 = new Book();
        b1.setBookId(1);
        b1.setBookName("Java编程思想");
        Book b2 = new Book();
        b2.setBookId(1);
        b2.setBookName("Java变成死相");
        boolean bool = b1.equals(b2);
        System.out.println(bool);
    }

}
