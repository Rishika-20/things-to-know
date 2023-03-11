package com.knoldus.temperatureconverter;
public class TemperatureConverter {
    private static double CONVERSION_FACTOR = 1.8;

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * CONVERSION_FACTOR) + 32;
        return fahrenheit;
    }
        public static void main(String[] args) {
        double celsius = 20.0;
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degree Celsius = " + fahrenheit + " degree Fahrenheit.");
    }
}
