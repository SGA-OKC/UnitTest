package org.example;

public class CalculadoraDesconto {

    public static double apilcarDesconto(double valor, double percentual){
        if (percentual < 100 && percentual > 0){
            return (valor) - ((valor * percentual) /100);
        }
        throw new ArithmeticException();
    }
}
