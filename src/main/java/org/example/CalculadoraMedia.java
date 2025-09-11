package org.example;

public class CalculadoraMedia {

    public static double calcularMedia(double[] numeros){
        if(numeros == null || numeros.length == 0){
            throw new IllegalArgumentException("Array vazio ou nulo");
        }
        int soma = 0;
        for(double n : numeros){
            soma += n;
        }
        return (double) soma / numeros.length;
    }
}