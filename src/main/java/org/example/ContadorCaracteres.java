package org.example;

public class ContadorCaracteres {

    public static int contar(String texto, char letra){
        if (texto == null || texto.isEmpty()){
            return 0;
        }
        int contagem = 0;
        for(char c : texto.toCharArray()) {
            if (c == letra) {
                contagem++;
            }
        }
        return contagem;
    }
}