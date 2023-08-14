package com.xja.test;

import com.xja.enums.PizzaEnum;
import com.xja.factory.PizzaFactory;
import com.xja.pizza.Pizza;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = PizzaFactory.create(PizzaEnum.SUPER_SUPREME);
    }
}
