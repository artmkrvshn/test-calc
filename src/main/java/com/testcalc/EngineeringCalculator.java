package com.testcalc;

public class EngineeringCalculator extends BasicCalculator implements EngineeringOperations {

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double squareRoot(double a) throws ArithmeticException {
        if (a < 0) {
            throw new ArithmeticException("Square root of negative number is not allowed.");
        }
        return Math.sqrt(a);
    }

}
