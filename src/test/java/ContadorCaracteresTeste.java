
import org.example.ContadorCaracteres;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContadorCaracteresTeste {

    @Test
    public void DevecontarCaractere(){
        int resultado = ContadorCaracteres.contar("paralelepipedo", 'a');
        assertEquals(2, resultado);
    }

    @Test
    public void DevecontarCaracereInexistente(){
        int resultado = ContadorCaracteres.contar("Vitinho", 'y');
        assertEquals(0, resultado);
    }

    @Test
    public void DeveContarTextoInexistente(){
        int resultado = ContadorCaracteres.contar("", 'D');
        assertEquals(0,resultado);
    }
}



