package br.ifpb.edu.br.praticas.testes;

/**
 * Created by diogomoreira on 08/03/17.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    public void testaSoma() throws NumeroNuloException {
        int num1 = 3;
        int num2 = 2;
        int soma = calculadora.soma(3,2);
        assertEquals(5, soma);

    }

    @Test(expected = NumeroNuloException.class)
    public void testaSomaComNumerosNulos() throws NumeroNuloException {
        int num2 = 2;
        Integer num3 = null;
        int soma = calculadora.soma(num2, num3);
    }

}
