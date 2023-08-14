package com.xja.test;

import com.xja.domain.Book;
import com.xja.domain.Goods;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组排序的方法
 */
public class ArraySortTest {


    @Test
    public void test06(){
        ArrayList<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods(1,"商品1",1d));
        goodsList.add(new Goods(2,"商品2",3d));
        goodsList.add(new Goods(3,"商品3",2d));
        for (int i = 0; i < goodsList.size() ; i++) {
            for (int j = 0; j < goodsList.size() - i - 1; j++) {
                //进行比较和交换
                if( goodsList.get(j).getGoodsId() > goodsList.get(j+1).getGoodsId() ){
                    Goods t = goodsList.get(j);
                    goodsList.set(j,goodsList.get(j+1));
                    goodsList.set(j+1,t);
                }
            }
        }
        System.out.println(goodsList);
    }
    @Test
    public void test05(){
        ArrayList<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods(1,"商品1",1d));
        goodsList.add(new Goods(2,"商品2",3d));
        goodsList.add(new Goods(3,"商品3",2d));
        for (int i = 0; i < goodsList.size() ; i++) {
            for (int j = 0; j < goodsList.size() - i - 1; j++) {
                //进行比较和交换
                if( goodsList.get(j).getGoodsPrice() > goodsList.get(j+1).getGoodsPrice() ){
                    Goods t = goodsList.get(j);
                    goodsList.set(j,goodsList.get(j+1));
                    goodsList.set(j+1,t);
                }
            }
        }
        System.out.println(goodsList);
    }
    @Test
    public void test04(){
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1,"商品1",1d));
        bookList.add(new Book(2,"商品2",3d));
        bookList.add(new Book(3,"商品3",2d));
        for (int i = 0; i < bookList.size() ; i++) {
            for (int j = 0; j < bookList.size() - i - 1; j++) {
                //进行比较和交换
                if( bookList.get(j).getBookPrice() > bookList.get(j+1).getBookPrice() ){
                    Book t = bookList.get(j);
                    bookList.set(j,bookList.get(j+1));
                    bookList.set(j+1,t);
                }
            }
        }
        System.out.println(bookList);
    }
    @Test
    public void test03() {
        Book[] arr = new Book[3];
        arr[0] = new Book(1,"商品1",1d);
        arr[1] = new Book(2,"商品2",3d);
        arr[2] = new Book(3,"商品3",2d);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //进行比较和交换
                if( arr[j].getBookPrice() < arr[j+1].getBookPrice() ){
                    Book t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test02() {
        String[] arr = {"a","c","d","b"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //进行比较和交换
                if( arr[j].compareTo( arr[j+1] ) > 0 ){
                    String t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void test01() {
        int[] arr = {1, 5, 8, 7, 6, 3, 4, 9, 10, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //进行比较和交换
                if(arr[j] < arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
