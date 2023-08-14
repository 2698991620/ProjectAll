package com.xja.factory;

import com.xja.enums.PizzaEnum;
import com.xja.pizza.Pizza;
import com.xja.pizza.SeafoodSupreme;
import com.xja.pizza.SuperSupreme;

public class PizzaFactory {
    public static Pizza create(PizzaEnum pizzaEnum){
        Pizza pizza=null;
        switch (pizzaEnum){
            case SEAFOOD_SUPREME:
                pizza = new SeafoodSupreme();
                break;
            case SUPER_SUPREME:
                pizza = new SuperSupreme();
                break;
        }
        pizza.prepare();
        pizza.make();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
