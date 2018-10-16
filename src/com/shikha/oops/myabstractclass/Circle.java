package com.shikha.oops.myabstractclass;

public abstract class Circle {
    double pi = 3.14;
    double radius;
    String circle;

    public void disply(String circletype, double area)

    {
        System.out.println("area of "+circletype+" is "+area);

    }

    public  abstract double areaofcircle(double area);

}
