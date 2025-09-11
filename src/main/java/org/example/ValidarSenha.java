package org.example;

public class ValidarSenha {

    public static boolean validar(String senha){
        if (senha.length() < 8){
            return false;
        }
        boolean umNumero = false;
        boolean letraMaiuscula = false;

        for (char c : senha.toCharArray()){
            if (c >= 'A' && c <= 'Z') {
                letraMaiuscula = true;
            } else if (c >= '0' && c <= '9'){
                umNumero = true;
            }
        }
        return umNumero && letraMaiuscula;
    }
}
