package com.shikha.oops.myinterface;

public class SemiCircle implements Circle {

  public double perimeterOfCircle(double radius){

         //double area=pi*((radius * radius)/2);
         double perimeter=pi*radius;
        // System.out.print(" Area of Semi Circle is -> "+area);
         System.out.println("perimeter of Semi Circle is=0"+perimeter);
        return perimeter;

    }

}
