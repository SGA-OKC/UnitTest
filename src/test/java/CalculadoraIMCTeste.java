import org.example.Calculadora;
import org.example.CalculadoraIMC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraIMCTeste {

    @Test
    public void imcNormal(){
        double resultado = CalculadoraIMC.calcularIMC(75.6,1.78);

        assertEquals(23.86,resultado,0.02);
    }

    @Test
    public void imcLancarExceptionPorZero(){
        assertThrows(ArithmeticException.class,() -> {
            CalculadoraIMC.calcularIMC(0.00,0.00);
        });

    }
}
