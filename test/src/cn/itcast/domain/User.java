package cn.itcast.domain;

import java.io.Serializable;

public class User implements Serializable{
    private String name ;
    private int age ;
    private String address;

    public static void main(String[] args) {
        test();
    }
    public static void test(){
        System.out.println("测试git");
    }
}
