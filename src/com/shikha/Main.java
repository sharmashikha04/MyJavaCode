package com.shikha;

import com.shikha.oops.myinterface.Circle;
import com.shikha.oops.myinterface.FullCircle;
import com.shikha.oops.myinterface.SemiCircle;

public class Main {

    public static void main(String[] args) {

        Circle circle=null; //reference variable declarstion

        circle=new FullCircle(); //creating object of type FullCircle on ref. variable circle
        circle.areaOfCircle(10);

        circle=new SemiCircle();  //creating object of type SemiCircle on ref. variable circle
        circle.areaOfCircle(10);


    }
}
