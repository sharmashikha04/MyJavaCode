package com.shikha;


import com.shikha.oops.myencapsul.Student;
import com.shikha.oops.myoverload.Test;

public class Main {

    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.show(10);
        t.show(10.5);


        /*Student s=new Student();
        s.setName("Shikha");
        s.setRollno(10);
        s.setMarks(55.5);
        System.out.println("Name of student is:"+s.getName());
        System.out.println("Rollno of student is:"+s.getRollno());
        System.out.println("Marks of student is:"+s.getMarks());
*/

       // Circle circle=null; //reference variable declarstion

        //circle=new FullCircle(); //creating object of type FullCircle on ref. variable circle
        //circle.perimeterOfCircle(10);

        //circle=new SemiCircle();  //creating object of type SemiCircle on ref. variable circle
        //circle.perimeterOfCircle(10);


       /* double tempResult;
        Circle circle=null;

        circle=new FullCircle();
        tempResult=circle.areaofcircle(10.8);
        circle.disply("Full Circle",tempResult);


        circle=new SemiCircle();
        tempResult=circle.areaofcircle(2.3);
        circle.disply("Semi Circle",tempResult);
*/


    }
}
