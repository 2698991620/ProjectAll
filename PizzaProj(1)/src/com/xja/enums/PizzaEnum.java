package com.xja.enums;

public enum PizzaEnum {
    SEAFOOD_SUPREME("com.xja.pizza.SeafoodSupreme"),
    SUPER_SUPREME("com.xja.pizza.SuperSupreme");
    private String className;
    PizzaEnum(String className) {
        this.className = className;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
}
