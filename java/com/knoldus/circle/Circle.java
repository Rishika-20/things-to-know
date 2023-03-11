package com.knoldus.circle;

public class Circle {
    public static final double pi = 3.14159;
    public static double getCircumferenceOfCircle(double radius) {
        double circumference = 2 * pi * radius;
        return circumference;
    }
    public static void main(String[]args) {
        double radius = 5.0;
        double circumference = Circle.getCircumferenceOfCircle(radius);
        System.out.println("Circumference of circle is: " +circumference);
    }
}

