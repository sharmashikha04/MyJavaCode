package com.shikha.ds.mylinklist;


class SingleLinklist {
      Node start = null;
      Node last=null;

    int address;
    Node temp;
   void addfirst(int data) {


        Node node = new Node(data, null);

        if (start == null) {
            start = node;
        } else {
            node.address = start;
            start = node;
        }
    }
    void  addlast(int data) {
        Node node = new Node(data,null);

        if (start == null) {   //start==null to test wheather list is empty
          start=node;
        }else
        {
            temp=start;

            while(temp.address!=null){
                temp=temp.address;
            }
            temp.address=node;
            //temp=node;
        }
    }


    void addMiddle(int data,int location) {

        int count = 1;   //this variable will help us to identify location where we want add to


        /*
       1. create new Node

       2. if location equal to 1 and start== null
            then start=node

       3. else if(start !=null && location==count){
                node.addr=start;
                start=node;

      4. else
        a. temp=start
        b. Node temp2=temp
        c. while temp  != null && location != count
                - temp2=temp
                - temp=temp.addr
                - count ++
        d. if(location == count){
                node.addr=temp2.addr
                temp2.addr=node
        }else{
            print(location is out of range)
        }


         */

        Node node = new Node(data, null);
        Node temp2=null;


        if (location == 1 && start == null) {

            start = node;
        }
        else if(start !=null && location==count) {
            node.address = start;
            start = node;

        }else {

            temp=start;
            temp2=temp;
            while (temp != null && location != count) {
                temp2 = temp;
                temp = temp.address;
                count++;
            }

            if (location == count) {
                node.address = temp2.address;
                temp2.address = node;
            } else {
                System.out.println("location is out of range");
            }
        }

    }


    void deleteFirst()
    {
        if (start==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            System.out.println("deleting the node:"    +start.data);
            start=start.address;
        }


    }


    void deletelast()
    {
        if (start==null){
            System.out.println("list is empty");


        }else {

            temp=start;
            Node temp2=temp;
            while (temp.address != null) {

                temp2=temp;
                temp=temp.address;

            }

            System.out.println("deleting node: "+temp.data);
            temp2.address=null;
        }
    }






    void display() {
        Node temp = null;
        if (start == null) {

            System.out.println("list is empty");

            return;
        } else
            temp =start;
        do {

            System.out.println(temp.data);
            temp = temp.address;


        } while (temp != null);


    }

}

class Node{


    public   int data;
    public Node address;

    Node(int data, Node address)
    {
        this.data=data;
        this.address=address;
    }

}
