package com.knoldus.shapes;
public class Rectangles {

    public static double length;
    public static double breadth;
    public double getareaOfRectangle(double length, double breadth) {
        double areaOfRectangle = length * breadth;
        return areaOfRectangle;
    }
    public double getPerimeterOfRectangle(double length, double breadth) {
        double PerimeterOfRectangle = 2 *(length + breadth);
        return PerimeterOfRectangle;
    }

}
