import org.example.ValidarSenha;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidadorSenhaTeste {

    @Test
    public void validarSenhasCorretas(){
        boolean senhaCorreta = ValidarSenha.validar("Atenas12");

        assertTrue("Senha correta", senhaCorreta);
    }
    @Test
    public void validarSenhasCorretas2(){
        boolean senha = ValidarSenha.validar("Teste12V");

        assertTrue("Senha correta", senha);
    }

    @Test
    public void validarSenhasCorretas3(){
        boolean senhaCorreta = ValidarSenha.validar("Futebol94");

        assertTrue("Senha correta", senhaCorreta);
    }


    @Test
    public void validarSenhas(){
        boolean senhaErrada = ValidarSenha.validar("Teste1");

        assertTrue("Senha esta correta", senhaErrada);
    }

    @Test
    public void validarSenhas2(){
        boolean senhaErrada = ValidarSenha.validar("Erro2");

        assertTrue("Senha esta correta", senhaErrada);
    }

    @Test
    public void validarSenhas3(){
        boolean senhaErrada = ValidarSenha.validar("Erro3");

        assertTrue("Senha esta correta", senhaErrada);
    }
}
