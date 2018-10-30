package com.shikha.ds.mystack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StackDemo {
   static int option;


    public static void main(String[] args) throws IOException {

        MyStack ms=new MyStack();
        int data;

            while (true) {
            System.out.println("**enter any option**");
            System.out.println("1. push :-");
            System.out.println("2. pop :-");
            System.out.println("3.display");

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                option = Integer.parseInt(br.readLine());

                switch (option)
                {
                    case 1:

                        //take input from keyboard for the number you want to push to stack
                        System.out.print("enter the num");
                        data = Integer.parseInt(br.readLine());


                        //call push method to push number;

                              ms.push(data);
                        break;



                    case 2:
                        //call pop method here
                        ms.pop();
                        break;


                    case 3:
                       //call display method here
                        ms.display();


                        break;
                    default:System.out.println("Wrong option..please enter option 1 2 or 3 from keyboard");

                }


            }

        }
    }
