package com.shikha.myio;

import java.util.Scanner;

public class SccanerUse {
    public  static void main(String[] args)
    {
         String s="hello";
        Scanner scan=new Scanner(s);
        System.out.println("String: " +scan.nextLine());
        scan.close();
        System.out.println("--------Please Enter Your Details-------- ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println("Name: " + name);
        System.out.print("Enter your age: ");
        int i = in.nextInt();
        System.out.println("Age: " + i);
        System.out.print("Enter your salary: ");
        double d = in.nextDouble();
        System.out.println("Salary: " + d);
        in.close();

    }
}
