package br.ifpb.edu.br.praticas.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by diogomoreira on 08/03/17.
 */
public class ValidadorRG {

    public boolean validar(String rg) {
        
        if(rg == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("\\d{6}-\\d");
        Matcher matcher = pattern.matcher(rg);
        return matcher.matches();
    }

}
