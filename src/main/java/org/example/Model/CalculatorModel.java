package org.example.Model;

public class CalculatorModel {
    public double add(double x, double y){
        return x+y;
    }
    public double subtract(double x, double y){
        return x-y;
    }
    public double multiply(double x, double y) {
        return x*y;
    }
    public double divide(double x, double y) throws ArithmeticException {
        if (y==0){
            throw new ArithmeticException("Деление на ноль");
        }
        return x/y;
    }
}
