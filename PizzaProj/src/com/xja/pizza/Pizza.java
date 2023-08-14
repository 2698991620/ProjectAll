package com.xja.pizza;

public abstract class Pizza {
    public abstract void prepare();
    public abstract void make();
    public void bake(){
        System.out.println("烘焙！");
    }
    public void cut(){
        System.out.println("用刀切！");
    }
    public void box(){
        System.out.println("装盒！");
    }
}
