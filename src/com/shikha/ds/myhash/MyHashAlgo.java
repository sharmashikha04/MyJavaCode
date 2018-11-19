package com.shikha.ds.myhash;

import java.net.SocketOption;

public class MyHashAlgo {

    private final static int key=11;

    int[] hashTable=new int[11];

//static implementation
    public void add(int value){

        int index=value % key;   // thid is hash function , it uses arithmatic remainder fn

        if(hashTable[index]==0){
            hashTable[index]=value;
            System.out.println(value+" Added Successfully to Hash Table");
        }else{
            System.out.println(" Collision Occured for ......"+value);
        }


    }




}
