package br.ifpb.edu.br.praticas.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diogomoreira on 08/03/17.
 */
public class ValidadorRGTest {

    private ValidadorRG validador;

    @Before
    public void setUp() {
        validador = new ValidadorRG();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testaQuantidadeCaracteres() {
        String rgTest = "1278162871";
        assertFalse(validador.validar(rgTest));
        rgTest = "";
        assertFalse(validador.validar(rgTest));
    }

    @Test
    public void testaRGNulo() {
        String rg = null;
        assertFalse(validador.validar(rg));
    }

    @Test
    public void testaCaracteresValidos() {
        String rg = "AAAAAA-A";
        assertFalse(validador.validar(rg));
        rg = "789787#8";
        assertFalse(validador.validar(rg));
        rg = "7A844A-9";
        assertFalse(validador.validar(rg));
        rg = "      - ";
        assertFalse(validador.validar(rg));
        rg = "---------";
        assertFalse(validador.validar(rg));
    }

    @Test(timeout = 2)
    public void testaRGValido() {
        String rg = "169276-7";
        assertTrue(validador.validar(rg));
    }


}