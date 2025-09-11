import org.example.Temperatura;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperaturaTeste {

    @Test
    public void deveConverterDeCelsiusParaFahrenheit(){

        double conversaoNegativa = Temperatura.celsiusParaFahrenheit(-2.3);

        assertEquals(27.86,conversaoNegativa,0.01);
    }

    @Test
    public void deveConverterDeCelsiusParaFahrenheit2(){

        double conversaoPositiva = Temperatura.celsiusParaFahrenheit(3.5);

        assertEquals(38.3,conversaoPositiva,0.01);
    }

    @Test
    public void deveConverterDeCelsiusParaFahrenheit3(){

        double conversaoZero = Temperatura.celsiusParaFahrenheit(0.0);

        assertEquals(32.0,conversaoZero,0.01);
    }


    @Test
    public void deveConverterDeFahrenheitParaCelsius(){
        double conversaoPositiva = Temperatura.fahrenheitParaCelsius(6.2);

        assertEquals(-14.3, conversaoPositiva,02);
    }

    @Test
    public void deveConverterDeFahrenheitParaCelsius1(){
        double conversaoNegativa = Temperatura.fahrenheitParaCelsius(-18.8);

        assertEquals(-28.22,conversaoNegativa,0.01);
    }
    @Test
    public void deveConverterDeFahrenheitParaCelsius3(){
        double conversaoZero = Temperatura.fahrenheitParaCelsius(0.0);

        assertEquals(-17.77,conversaoZero,0.01);
    }
}
