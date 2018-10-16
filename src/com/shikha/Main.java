package com.shikha;


import com.shikha.oops.myabstractclass.Circle;
import com.shikha.oops.myabstractclass.FullCircle;
import com.shikha.oops.myabstractclass.SemiCircle;

public class Main {

    public static void main(String[] args) {


       // Circle circle=null; //reference variable declarstion

        //circle=new FullCircle(); //creating object of type FullCircle on ref. variable circle
        //circle.perimeterOfCircle(10);

        //circle=new SemiCircle();  //creating object of type SemiCircle on ref. variable circle
        //circle.perimeterOfCircle(10);


        double tempResult;
        Circle circle=null;

        circle=new FullCircle();
        tempResult=circle.areaofcircle(10.8);
        circle.disply("Full Circle",tempResult);


        circle=new SemiCircle();
        tempResult=circle.areaofcircle(2.3);
        circle.disply("Semi Circle",tempResult);



    }
}
