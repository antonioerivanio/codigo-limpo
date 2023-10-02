package br.com.tce.ce.gov.codigolLimpo.cap01.adicioneContextoSignificativo;

public class MessageStatisticaDesafio {
    private String numero;
    private String verbo;
    private String modificadorPlural;

    public String criar(char candidato, int count){
        criarPluralParteMessageDependente(count);
        return String.format("There %s %s %s%s", verbo, numero, candidato, modificadorPlural);
    }

    private void criarPluralParteMessageDependente(int count) {
        if(count == 0){
            naoExisteLetras();
        }else if(count == 1){
            existeApenasUmaLetra();
        }else{
            existeMuitasLetras(count);
        }
    }

    private void existeMuitasLetras(int count) {
        numero = Integer.toString(count);
        verbo = "are";
        modificadorPlural = "s";
    }

    private void existeApenasUmaLetra() {
        numero = "1";
        verbo = "is";
        modificadorPlural = "";
    }

    private void naoExisteLetras() {
        numero = "0";
        verbo = "are";
        modificadorPlural = "s";
    }
}
