package com.company;

public class UncleTwo extends Uncle {

    //独有的方法
    public void hejiu(){
        System.out.println("二舅喜欢喝酒");

    }

    //复写（覆写）Override  父类中的方法
    public void faHongbao(){
        System.out.println("家道中落，不发红包，改送祝福");
    }
}
