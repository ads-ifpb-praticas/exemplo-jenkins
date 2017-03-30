package br.ifpb.edu.br.praticas.testes;

/**
 * Created by diogomoreira on 08/03/17.
 */
public class Calculadora {

    public Integer soma(Integer i, Integer i1) throws NumeroNuloException {
        if(i == null || i1 == null) {
            throw new NumeroNuloException();
        }
        return i + i1;
    }
}
