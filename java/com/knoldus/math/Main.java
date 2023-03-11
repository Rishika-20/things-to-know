package com.knoldus.math;

public class Main {
    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 5;

        int sum = Calculator.add(firstNumber, secondNumber);
        int difference = Calculator.subtract(firstNumber, secondNumber);
        int product = Calculator.multiply(firstNumber, secondNumber);
        int quotient = Calculator.divide(firstNumber, secondNumber);

        System.out.println("Sum: " +sum);
        System.out.println("Difference: " +difference);
        System.out.println("Product: " +product);
        System.out.println("Quotient: " +quotient);
    }
}
