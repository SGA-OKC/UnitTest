package org.example;

public class CalculadoraIMC {

    public static double calcularIMC(double peso, double altura){
        if (altura>0){
            return (peso/(altura*altura));
        }
        throw new ArithmeticException();
    }
}
