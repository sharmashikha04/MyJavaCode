package com.shikha.ds.myhash;

public class MyHashAlgoDynamicImpl {

    private static final int key=11;

    Node[] start=new Node[11];

    public MyHashAlgoDynamicImpl(){

        for (int i=0;i<11;i++){
            start[i]=null;
        }
    }

    public void add(int value){

        Node node=new Node(value,null);
        int index=value % key;

        if(start[index]==null){
            start[index]=node;
            System.out.println("Successfully Added "+value);
        }else {
            System.out.println(" Collision Occured for -> "+value+" ... Now Performing Re-Hashing using linked chaning ");
            Node temp=start[index];

            while (temp.addr!=null){
                temp=temp.addr;
            }
                temp.addr=node;
        }

    }


    public void display(){

        System.out.println(" Here is how hash table looks like :)  ....");

        Node temp;
        System.out.println(" Index      Value");
        for (int i=0;i<11;i++){

            temp=start[i];

            if(temp==null){
                System.out.println(i+"      null");
            }else {
                System.out.print(i);
                while (temp!=null){
                    System.out.print("      "+temp.value+"  -> ");
                    temp=temp.addr;
                }
                System.out.println("    null");

            }

        }

    }

}


class Node{

    int value;
    Node addr;

    Node(int value,Node addr){
        this.value=value;
        this.addr=addr;
    }
}
