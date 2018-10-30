package com.shikha.ds.mylinklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoDataStructureMain {



    public static  void  main(String[] args)throws IOException {
        InputStreamReader i = new InputStreamReader(System.in); //it reads bytes from keyboard and convertes it to char stream
        BufferedReader br = new BufferedReader(i);


       SingleLinklist s=new SingleLinklist();



        int option;
        int num = 0;
        int location=1;
        while (true) {

            System.out.println("*****chhose one of the following options:*****");
            System.out.println("1:AddFirst() ");
            System.out.println("2:AddLast() ");
            System.out.println("3:Addmiddle() ");
            System.out.println("4:delete from first() ");
            System.out.println("5:delete from  last() ");
            System.out.println("6:display the num");
            System.out.println("7:exit");


            option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    System.out.println("please enter the num:");
                    num = Integer.parseInt(br.readLine());
                    s.addfirst(num);
                    break;


                case 2:
                    System.out.println("please enter the num:");
                    num = Integer.parseInt(br.readLine());
                    s.addlast(num);
                    break;

                case 3:
                    System.out.println("please enter the location:");
                    location = Integer.parseInt(br.readLine());
                    System.out.println("please enter the num:");
                    num = Integer.parseInt(br.readLine());
                    s.addMiddle( num,location);
                    break;

                case 4:
                    System.out.println("please enter the location:");
                    location = Integer.parseInt(br.readLine());
                    System.out.println("please enter the num:");
                    num = Integer.parseInt(br.readLine());
                    s.deleteFirst();
                    break;


                case 5:
                    System.out.println("please enter the location:");
                    location = Integer.parseInt(br.readLine());
                    s.deletelast();
                    break;

                case 6:
                   s.display();

                  break;


                    case 7:
                    System.exit(0);


                default:
                    System.out.println("Wrong option..please enter option 1 or 2 from keyboard");
            }

        }

    }}
