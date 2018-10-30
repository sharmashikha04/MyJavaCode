package com.shikha.ds.mystack;

public class MyStack {

    /*
       1. Declare variable size of type int, initialize it to 5
       2. Declare array of type integer of size=5
       3. Declare variable of type int, say top initialize it -1
     */

        int size=5;
        int[] stack = new int[size];
        int top=-1;


    /*
        1. Create push method --> void push(int data)
        2. check if stack is full , print appropriate message and return
        3. if stack is not full
            a. increment top
            b. add data to array of top ---> array[top]

     */
    public void push(int data)
    {
        if (top==size-1)
        {
            System.out.println("Stack is full");
            return;

        }else
        {
            top++;
            stack[top]=data;
        }

    }


    /*
        1. create  method --> void pop()
        2. check if stack is empty, print appropriate message and return
        3. if stack is not empty
            a. print data you will be removing i.e. array[top]
            b. decrement top by one position
     */
            public void pop() {
                if (top==-1) {
                    System.out.println("Stack is empty");
                    return;


                } else {
                    System.out.println("item popde is:-"+  stack[top]);
                    top--;
                }
            }

    /*
        1. create display method()
        2. create for loop  (int i=top;i>0;i--)
            a. print array[i]
     */
        public  void display() {

            for (int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }


}
