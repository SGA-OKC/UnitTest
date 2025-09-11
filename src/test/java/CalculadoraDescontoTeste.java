import org.example.CalculadoraDesconto;
import org.example.CalculadoraIMC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraDescontoTeste {

    @Test
    public void desconto50(){
        double resultado = CalculadoraDesconto.apilcarDesconto(75.6,0.50);

        assertEquals(75.22,resultado,0.1);
    }

    @Test
    public void desconto100(){
        double resultado = CalculadoraDesconto.apilcarDesconto(555.5, 1.00);

        assertEquals(549.945, resultado, 0.1);
    }

    @Test
    public void desconto0(){
        double resultado = CalculadoraDesconto.apilcarDesconto(785.5, 0.00);

        assertEquals(549.945, resultado, 0.1);
    }

    @Test
    public void imcLancarExceptionPorZero(){
        assertThrows(ArithmeticException.class,() -> {
            CalculadoraDesconto.apilcarDesconto(780.6,0.00);
        });

    }
}
