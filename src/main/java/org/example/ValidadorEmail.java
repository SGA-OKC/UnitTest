package org.example;

public class ValidadorEmail {

    public static boolean validar (String email){
        if (email == null){
            return false;
        }
        int atIndex = email.indexOf('@');
        if(atIndex == -1){
            return false;
        }
        String depoisdoArroba = email.substring(atIndex + 1);
        return depoisdoArroba.contains(".");
    }
}