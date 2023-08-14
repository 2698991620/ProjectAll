package com.xja.factory;

import com.xja.enums.PizzaEnum;
import com.xja.pizza.Pizza;

public class PizzaFactory {
    public static Pizza create(PizzaEnum pizzaEnum) throws Exception {
        String className = pizzaEnum.getClassName();
        Pizza pizza= (Pizza) Class.forName(className).newInstance();
        pizza.prepare();
        pizza.make();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
