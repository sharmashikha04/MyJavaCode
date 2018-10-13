package com.shikha.oops.myinterface;

public class FullCircle implements Circle {

    @Override
    public double perimeterOfCircle(double radius) {
        //double area=pi*radius * radius;
        double perimeter=2*pi*radius;
       // System.out.println(" Area of Full Circle is -> "+area);
        System.out.println("perimeter of Full Circle is="+perimeter);
        return perimeter;
    }
}
