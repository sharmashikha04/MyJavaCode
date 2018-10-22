package com.shikha.myio;

import com.shikha.oops.myencapsul.Student;

import java.io.*;

public class StudentInfoFile {
    static String  studentname;
    static int     studentrollno;
    static double  studentmarks;

    public  static  void main(String[] args) throws IOException {
        FileReader fr=new FileReader(new File("src/resources/myfile.txt"));
        FileWriter fout=new FileWriter(new File("src/resources/myfileout.txt"));
        BufferedReader br=new BufferedReader(fr);

       // System.out.println(" Please enter the name :- ");
        studentname = br.readLine();


        //System.out.println(" Please enter the roll no :- ");
        studentrollno = Integer.parseInt(br.readLine());


        //System.out.println(" Please enter the marks :- ");
        studentmarks = Double.parseDouble(br.readLine());

        Student s = new Student();
        s.setName(studentname);
        s.setRollno(studentrollno);
        s.setMarks(studentmarks);


       // System.out.println("My name is:- " + s.getName() + "  my rollnum is:-  " + s.getRollno() + "  my marks is:- " + s.getMarks());

        fout.write( s.getName());
        fout.write("\n");
        fout.write(s.getRollno()+"");
        fout.write("\n");
        fout.write(s.getMarks()+"");
        fout.flush();
        fout.close();

    }
    }
