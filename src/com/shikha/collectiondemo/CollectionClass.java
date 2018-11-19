package com.shikha.collectiondemo;

import com.shikha.myapplication.Student;
import com.shikha.myapplication.StudentApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionClass {



    static  int option;
        static String Name,city;
        static int rollno;



        public static  void  main(String[] args)throws IOException {

            InputStreamReader i = new InputStreamReader(System.in); //it reads bytes from keyboard and convertes it to char stream
            BufferedReader br = new BufferedReader(i);

            List<Student> l = new ArrayList();

            Student temp;



            while (true) {
                System.out.println("choose following options:");
                System.out.println("1.Add:");
                System.out.println("2.Display:");
                System.out.println("3.Exit");

                option = Integer.parseInt(br.readLine());





                switch (option) {
                    case 1:
                        Student s1=new Student();

                        System.out.println("please enter the Student Name:");
                        Name = br.readLine();
                        System.out.println("please enter the Student Rollnum :");
                        rollno = Integer.parseInt(br.readLine());
                        System.out.println("please enter the Student city:");
                        city = br.readLine();

                        s1.setCity(city);
                        s1.setRollnum(rollno);
                        s1.setName(Name);

                        l.add(s1);

                        break;

                    case 2:
                        Iterator<Student> itr=l.iterator();

                        while (itr.hasNext()){
                                temp=itr.next();
                            System.out.println(temp.getName()+" -- "+temp.getRollnum()+" -- "+temp.getCity());
                        }


                        break;


                    case 3:
                        System.exit(0);


                        default:
                        System.out.println("Wrong option..please enter correct option from keyboard");


                }


            }

    }

}
