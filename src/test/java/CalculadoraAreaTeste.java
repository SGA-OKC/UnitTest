import org.example.CalculadoraArea;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraAreaTeste {

    @Test
    public void deveCalcularQuadrado(){
        double resultado = CalculadoraArea.areaQuadrado(13);
        assertEquals(169, resultado, 0.2);
    }

    @Test
    public void deveCalcularRetangulo(){
        double resultado = CalculadoraArea.areaRetangulo(12, 15);
        assertEquals(180, resultado, 0.2);

    }

    @Test
    public void deveCalcularCirculo(){
        double resultado = CalculadoraArea.areaCirculo(17);
        assertEquals(907, resultado, 1);
    }

    @Test
    public void deveCalcularErroQuadrado(){
        assertThrows(ArithmeticException.class, () ->{
            CalculadoraArea.areaQuadrado(-15);
        });
    }

    @Test
    public void deveCalcularErroRetangulo(){
        assertThrows(ArithmeticException.class, () ->{
            CalculadoraArea.areaRetangulo(-13, 3);
        });
    }

    @Test
    public void deveCalcularErroCirculo(){
        assertThrows(ArithmeticException.class, () ->{
            CalculadoraArea.areaCirculo(-5);
        });
    }
}