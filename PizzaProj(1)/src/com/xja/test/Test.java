package com.xja.test;

import com.xja.enums.PizzaEnum;
import com.xja.factory.PizzaFactory;
import com.xja.pizza.Pizza;
import com.xja.pizza.SeafoodSupreme;
import com.xja.pizza.SuperSupreme;

public class Test {
    public static void main(String[] args) throws Exception {
        Pizza pizza = PizzaFactory.create(PizzaEnum.SEAFOOD_SUPREME);
        
//        SeafoodSupreme seafoodSupreme = new SeafoodSupreme();
//        seafoodSupreme.prepare();
//
//        //通过一个字符串的类名。来创建这个类的对象
//        String className = "com.xja.pizza.SuperSupreme";
//        SuperSupreme superSupreme = (SuperSupreme) Class.forName(className).newInstance();
//        superSupreme.prepare();
    
    }
}
