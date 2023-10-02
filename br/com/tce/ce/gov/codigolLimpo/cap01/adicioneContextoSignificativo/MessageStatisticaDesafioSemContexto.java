package br.com.tce.ce.gov.codigolLimpo.cap01.adicioneContextoSignificativo;

public class MessageStatisticaDesafioSemContexto {
    private void imprimirStatisticasDesafio(char candidato, int count){
        String numero;
        String verbo;
        String modificadorPlural;
        if(count == 0){
            numero  = "0";
            verbo = "are";
            modificadorPlural = "";
        }else if(count == 1) {
            numero = "1";
            verbo = "is";
            modificadorPlural = "";
        } else {
            numero = Integer.toString(count);
            verbo = "are";
            modificadorPlural = "s";
        }
        String mensageDesafio = String.format("There %s %s %s%s", verbo, numero, candidato, modificadorPlural);
        System.out.printf(mensageDesafio);
    }
}
