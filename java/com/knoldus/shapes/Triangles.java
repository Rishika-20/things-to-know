package com.knoldus.shapes;

public class Triangles {

    public static double height;
    public static double breadth;
    public static double length;

    public double getAreaOfTriangle(double height, double breadth) {
        double areaOfTriangle = 0.5 * height * breadth;
        return areaOfTriangle;
    }
    public double getPerimeterOfTriangle(double height, double breadth, double length) {
        double PerimeterOfTriangle = (height + breadth) + length;
        return PerimeterOfTriangle;
    }
}
