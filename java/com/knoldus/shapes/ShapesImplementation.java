package com.knoldus.shapes;


import java.util.Scanner;

public class ShapesImplementation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Printing the results of circle class.
        Circles circlesOperation = new Circles();
        System.out.println("Enter the radius of a circle:");
        double radius = scan.nextDouble();
        System.out.println("Area of circle is: "+circlesOperation.getAreaOfCircle(radius));
        System.out.println("Perimeter of circle is: "+circlesOperation.getPerimeterOfCircle(radius));


        //Printing the results of Rectangles class.
        Rectangles rectanglesOperation = new Rectangles();
        System.out.println("\nEnter the length of a rectangle:");
        double length = scan.nextDouble();
        System.out.println("Enter the breadth of a rectangle:");
        double breadth = scan.nextDouble();
        System.out.println("Area of rectangle is: "+rectanglesOperation.getareaOfRectangle(length, breadth));
        System.out.println("Perimeter of rectangle is: "+rectanglesOperation.getPerimeterOfRectangle(length,breadth));

        //Printing the results of Triangle class.
        Triangles trianglesOperation = new Triangles() ;
        System.out.println("\nEnter the length of a Triangle:");
        double lengthForTriangle = scan.nextDouble();
        System.out.println("Enter the breadth of a Triangle:");
        double breadthForTriangle = scan.nextDouble();
        System.out.println("Enter the height of a Triangle:");
        double heightOfTriangle = scan.nextDouble();
        System.out.println("Area of Triangle is: "+trianglesOperation.getAreaOfTriangle(breadthForTriangle, heightOfTriangle));
        System.out.println("Perimeter of Triangle is: "+trianglesOperation.getPerimeterOfTriangle(lengthForTriangle,breadthForTriangle, heightOfTriangle));
    }
}
