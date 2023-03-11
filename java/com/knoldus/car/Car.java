package com.knoldus.car;
public class Car {
    private static int totalNumOfCars = 0;
    public Car() {
        totalNumOfCars++;
    }
    public static int getTotalNumOfCars() {
        return totalNumOfCars;
    }
    public static void main(String[] args) {
        Car firstCar = new Car();
        Car secondCar = new Car();
        System.out.println("Total number of cars: "+Car.getTotalNumOfCars());
    }
}
