package com.shikha.oops.myinterface;

public class SemiCircle implements Circle {

  public double areaOfCircle(double radius){

        double area=pi*((radius * radius)/2);
        System.out.print(" Area of Semi Circle is -> "+area);
        return area;

    }

}
