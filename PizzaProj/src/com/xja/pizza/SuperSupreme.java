package com.xja.pizza;

/**
 * 超级至尊比萨<br>
 * 备料(prepare)--->制作(make)--->烘焙(bake)--->用刀切(cut)--->装盒(box)
 */
public class SuperSupreme extends Pizza{
    public void prepare(){
        System.out.println("备料：腊肉肠、意式香肠、火腿、五香牛肉、五香猪肉，" +
                "搭配菠萝、蘑菇、洋葱、青椒等，如此丰盛馅料，口口都是令人满足的好滋味");
    }
    public void make(){
        System.out.println("制作：超级至尊比萨！");
    }
}
