package com.shikha.oops.myinterface;

public class FullCircle implements Circle {

    @Override
    public double areaOfCircle(double radius) {
        double area=pi*radius * radius;
        System.out.println(" Area of Full Circle is -> "+area);
        return area;
    }
}
