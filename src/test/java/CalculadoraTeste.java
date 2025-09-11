import org.example.Calculadora;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTeste {

    @Test
    public void deveSomarDoisNumeros(){
        int resultado = Calculadora.soma(2,3);

        assertEquals(5,resultado);
    }

    @Test
    public void deveSubtrairDoisNumeros(){
        int resposta = Calculadora.subtrair(8,5);

        assertEquals(3,resposta);
    }

    @Test
    public void deveMultiplicarNumero(){
        int resulFinal = Calculadora.multiplicar(2,3);

        assertEquals(6,resulFinal);
    }

    @Test
    public void deveDividirNumeros(){
        int resultado = Calculadora.dividir(8,2);

        assertEquals(4,resultado);
    }

    @Test
    public void deveLancarExceptionDivisorPorZero(){
        assertThrows(ArithmeticException.class,() -> {
            Calculadora.dividir(8,4);
        });
    }
}
