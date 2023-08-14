package com.xja.pizza;

/**
 * 海鲜至尊比萨<br>
 * 备料(prepare)--->制作(make)--->烘焙(bake)--->用刀切(cut)--->装盒(box)
 */
public class SeafoodSupreme extends Pizza{
    public void prepare(){
        System.out.println("备料：大虾、蟹柳等丰富海鲜美味荟萃，" +
                "配上酸甜菠萝、青椒，海鲜美味扑面而来");
    }
    public void make(){
        System.out.println("制作：海鲜至尊比萨！");
    }
}
