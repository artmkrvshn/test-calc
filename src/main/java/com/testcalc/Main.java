package com.testcalc;

public class Main {
    public static void main(String[] args) {
        EngineeringCalculator calculator = new EngineeringCalculator();

        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        try {
            System.out.println("Division: " + calculator.divide(5, 3));
            System.out.println("Division by zero: " + calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Power: " + calculator.power(2, 3));
        try {
            System.out.println("Square Root: " + calculator.squareRoot(9));
            System.out.println("Square Root of negative number: " + calculator.squareRoot(-1));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}