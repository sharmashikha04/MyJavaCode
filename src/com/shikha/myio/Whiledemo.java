package com.shikha.myio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Whiledemo {

    public static void main(String[] args)throws IOException
    {
        InputStreamReader i=new InputStreamReader(System.in); //it reads bytes from keyboard and convertes it to char stream
        BufferedReader br=new BufferedReader(i); //it stores char stream in buffer in safe way


        int option;
        int num=1
                ;
        while (true)
        {

            System.out.println("1:check num is even/odd");
            System.out.println("2:exit");
            System.out.println("3:please choose one of the above option:");
            option=Integer.parseInt(br.readLine());

            switch (option)
            {
                case 1:System.out.println("please enter the num:");
                    num=Integer.parseInt(br.readLine());

                    if(num%2==0)
                    {
                        System.out.println(num+"   Number is even");
                    }else
                    {
                        System.out.println(num+"   Number is odd");
                    }break;

                case 2:System.exit(0);


                 default:System.out.println("Wrong option..please enter option 1 or 2 from keyboard");
            }

        }

    }
}
