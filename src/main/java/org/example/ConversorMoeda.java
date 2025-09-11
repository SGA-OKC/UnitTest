package org.example;

public class ConversorMoeda {

    public static double realParaDolar(double valor, double cotacao){
        if (valor > 0){
            return (valor/cotacao);
        }
        throw new ArithmeticException();
    }
}
