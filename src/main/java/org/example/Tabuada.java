package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tabuada {

    public static List<Integer> gerarTabuada(int num) {
        List<Integer> numero = new ArrayList<>();

        for (int i = 1; i <=10; i++){
            numero.add(num * i);
        }
        return numero;
    }

}
