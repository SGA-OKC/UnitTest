import org.example.CalculadoraDesconto;
import org.example.ConversorMoeda;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ConversorMoedaTeste {

    @Test
    public void conversor(){
        double resultado = ConversorMoeda.realParaDolar(755.5,5.22);

        assertEquals(144.73, resultado, 0.1);
    }

    @Test
    public void conversor2(){
        double resultado = ConversorMoeda.realParaDolar(60.8,5.22);

        assertEquals(11.64, resultado, 0.1);
    }
    @Test
    public void imcLancarExceptionPorZero(){
        assertThrows(ArithmeticException.class,() -> {
            ConversorMoeda.realParaDolar(-90.6,5.22);
        });

    }
}
