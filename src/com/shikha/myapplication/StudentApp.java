package com.shikha.myapplication;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentApp {


    public static  void  main(String[] args)throws IOException {
        InputStreamReader i = new InputStreamReader(System.in); //it reads bytes from keyboard and convertes it to char stream
        BufferedReader br = new BufferedReader(i);

        SingleLinklist s=new SingleLinklist();


        String Name,city;
        double percentage;
        int option,rollno;
        int num = 0;
        int location=1;
        while (true) {

            System.out.println("*****chhose one of the following options:*****");
            System.out.println("1:Enter the student information:  ");
            System.out.println("2:delete student informetiom from middle() ");
            System.out.println("3:please enter the Rollnum which you want to search");
            System.out.println("4:display the num");
            System.out.println("5:exit");


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

                    s1.setName(Name);
                    s1.setRollnum(rollno);
                    s1.setCity(city);

                    s.addfirst(s1);

                    break;


                case 2:System.out.println("Enter the Rollnum which you want to delete:");
                    rollno = Integer.parseInt(br.readLine());
                    s.deletemiddle(rollno);
                    break;

                case 3:

                    System.out.println("Enter the rollnum which you want to search");
                    rollno = Integer.parseInt(br.readLine());
                    s.search(rollno);
                        break;

                case 4:


                    s.display();
                    break;


                case 5:
                    System.exit(0);


                default:
                    System.out.println("Wrong option..please enter correct option from keyboard");
            }

        }

    }


}
