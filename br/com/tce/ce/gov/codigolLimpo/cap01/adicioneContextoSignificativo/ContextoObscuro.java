package br.com.tce.ce.gov.codigolLimpo.cap01.adicioneContextoSignificativo;

public class ContextoObscuro {
    private void printGuessStatistics(char candidate, int count){
        String number;
        String verb;
        String pluralModifier;
        if(count == 0){
            number  = "0";
            verb = "are";
            pluralModifier = "";
        }else if(count == 1) {
            number = "1";
            verb = "is";
            pluralModifier = "";
        } else {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }
        String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
        System.out.printf(guessMessage);
    }
}
