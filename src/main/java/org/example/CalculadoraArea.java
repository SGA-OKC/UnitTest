package org.example;

public class CalculadoraArea {

    public static double areaQuadrado(double lado){
        if (lado < 0){
            throw new ArithmeticException();
        }
        return lado * lado;
    }

    public static double areaRetangulo(double base, double altura){
        if(base < 0 || altura < 0){
            throw new ArithmeticException();
        }
        return base * altura;
    }

    public static double areaCirculo(double raio){
        if(raio < 0){
            throw new ArithmeticException();
        }
        return Math.PI * raio * raio;
    }
}