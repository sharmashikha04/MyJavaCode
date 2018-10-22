package com.shikha.myio;

import com.shikha.oops.myencapsul.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Studentinfo {

        static String studentname;
        static int studentrollno;
        static double studentmarks;
        static char studentgrade;

        public static void main(String[] args) throws IOException {
                InputStreamReader i = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(i);

                System.out.println(" Please enter the name :- ");
                studentname = br.readLine();


                System.out.println(" Please enter the roll no :- ");
                studentrollno = Integer.parseInt(br.readLine());


                System.out.println(" Please enter the marks :- ");
                studentmarks = Integer.parseInt(br.readLine());

                Student s = new Student();
                s.setName(studentname);
                s.setRollno(studentrollno);
                s.setMarks(studentmarks);
                s.setGrade(studentgrade);


                System.out.println("My name is:- " + s.getName() + "  my rollnum is:-  " + s.getRollno() + "  my marks is:- " + s.getMarks());


                if (studentmarks <= 40 && studentmarks >= 0) {
                        System.out.println("Your grade is   E and your percentage is :-"  +    studentmarks );
                }else if (studentmarks > 40 && studentmarks  <= 50) {
                        System.out.println("Your grade is   D" +    studentmarks);
                }
                else if(studentmarks>50&&studentmarks<=60)
                {
                        System.out.println("Your grade is   C  and your percentage is :-"  +     studentmarks);
                }
                else if (studentmarks>60&&studentmarks<=70)
                {
                        System.out.println("Your grade is   B  and your percentage is :-"   +      studentmarks);


                }else {
                        System.out.println("your grade is A  and your percentage is :-"      +       studentmarks);
                }


        }


}










