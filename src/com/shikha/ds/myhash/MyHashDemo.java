package com.shikha.ds.myhash;

public class MyHashDemo {


    public static void main(String[] args) {

        MyHashAlgoDynamicImpl m=new MyHashAlgoDynamicImpl();
       // MyHashAlgo m=new MyHashAlgo();
        m.display();
        m.add(23);
        m.add(34);

       m.display();

    }
}
