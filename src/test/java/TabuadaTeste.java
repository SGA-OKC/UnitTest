import org.example.Tabuada;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TabuadaTeste {

    @Test
    public void deveGerarTabuada(){
        List<Integer> resultado = Tabuada.gerarTabuada(9);
        List<Integer> esperado = Arrays.asList(9,18,27,36,45,54,63,72,81,90);
        assertEquals(esperado,resultado);
    }
}
