import org.example.CalculadoraIMC;
import org.example.CalculadoraMedia;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraMediaTeste {

    @Test
    public void deveCalcularMediaArrayNormal (){
        double [] numeros = {10,5.6,5.9,9};
        double resultado = CalculadoraMedia.calcularMedia(numeros);
        assertEquals(7.25, resultado,0.01);
    }

    @Test
    public void deveCalcularMediaArrayComUmElemento(){
        double[] numeros = {50};
        double resultado = CalculadoraMedia.calcularMedia(numeros);
        assertEquals(50.0, resultado, 0.01);
    }

    @Test
    public void deveLancarExceptionParaArrayVazio (){
        double [] numeros = {};
        double resultado = CalculadoraMedia.calcularMedia(numeros);
        assertThrows(ArithmeticException.class, () ->{
            CalculadoraMedia.calcularMedia(numeros);
        });
    }


}