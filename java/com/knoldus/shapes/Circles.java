package com.knoldus.shapes;

public class Circles {
    public static double radius;
    public static final double pi = 3.14;
    public double getAreaOfCircle(double radius) {
         double areaOfCircle = pi * radius * radius;
         return areaOfCircle;
    }
    public double getPerimeterOfCircle(double radius) {
        double PerimeterOfCircle = 2 * pi * radius;
        return PerimeterOfCircle;
    }


}
