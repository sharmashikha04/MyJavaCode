package com.shikha.myapplication;


class SingleLinklist {
      Node start = null;
      Node last=null;

    int address;
    Node temp;
   void addfirst(Student data) {


        Node node = new Node(data, null);

        if (start == null) {
            start = node;
        } else {
            node.address = start;
            start = node;
        }
    }


       void  deletemiddle(int rollno) {
        Node temp2;
        int count = 1;
        temp2=temp;

        if (start == null) {
            System.out.println("list is empty");

        }else {
            temp = start;
            while (temp != null ) {

                if(temp.data.getRollnum()==rollno){
                    break;
                }

                temp2 = temp;
                temp = temp.address;
                 count++;
            }


            if(temp!=null){

                if (   temp.data.getRollnum()!=rollno) {
                    System.out.println("RollNO : "+rollno+" Not Found ....");
                } else if (temp.data.getRollnum()==rollno && count == 1) {
                    System.out.println(" Item deleted is " + temp.data.getRollnum() +" -- " +temp.data.getName());
                    start = start.address;
                } else {

                    System.out.println(" Item deleted is "+temp.data.getRollnum());
                    temp2.address=temp.address;
                }
            }else {
                System.out.println(" Stud Roll No your looking is not present ");
            }

        }
    }

    void search(int rollno)
    {
        Node temp2;
        int count = 1;
        temp2=temp;

        if (start == null) {
            System.out.println("list is empty");

        }else {
            temp = start;
            while (temp != null ) {

                if(temp.data.getRollnum()==rollno){
                    break;
                }

                temp2 = temp;
                temp = temp.address;
                count++;
            }


            if(temp!=null){

                if (   temp.data.getRollnum()!=rollno) {
                    System.out.println("RollNO : "+rollno+" Not Found ....");
                } else if (temp.data.getRollnum()==rollno && count == 1) {
                    System.out.println(" Item is found  " + temp.data.getRollnum() +" -- " +temp.data.getName());
                    //start = start.address;
                } else {

                    System.out.println(" Item  is found "+temp.data.getRollnum());
                    //.address=temp.address;
                }
            }else {
                System.out.println(" Stud Roll No your looking is not present ");
            }

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

            System.out.println("Name : "+temp.data.getName()+" Roll No : "+temp.data.getRollnum()+" City : "+temp.data.getCity());
            temp = temp.address;


        } while (temp != null);


    }

}

class Node{


    public   Student data;
    public Node address;

    Node(Student data, Node address)
    {
        this.data=data;
        this.address=address;
    }

}
