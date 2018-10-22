package com.shikha.myio.keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputOutput {
   static String name;
   static int num;

    public  static void  main(String[] args)throws IOException
    {
        InputStreamReader i=new InputStreamReader(System.in); //it reads bytes from keyboard and convertes it to char stream
        BufferedReader br=new BufferedReader(i); //it stores char stream in buffer in safe way


       //Our tasks 1 : read name of student from key board

     /*   System.out.println(" Please enter the name :- ");
        name=br.readLine();

        //Our task 2: read stud rollno from keyboard

        System.out.println(" Please enter the roll no :- ");
        num=Integer.parseInt(br.readLine());*/



      System.out.println("My Name is : "+name+" roll no is "+num);




    }

}
