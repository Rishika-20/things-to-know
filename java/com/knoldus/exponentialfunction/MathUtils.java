package com.knoldus.exponentialfunction;
public class MathUtils {
    final static double E = 2.71828;
    public static double calculateExponential(double number) {
        double result = Math.exp(number);
        return result;
    }
    public static void main(String[] args){
        double number = 2.0;
        double exponential = MathUtils.calculateExponential(number);
        System.out.println("The exponential of " + number + " is " + exponential);

    }
}
