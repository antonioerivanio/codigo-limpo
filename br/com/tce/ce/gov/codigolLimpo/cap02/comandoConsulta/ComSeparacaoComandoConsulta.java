package br.com.tce.ce.gov.codigolLimpo.cap02.comandoConsulta;

public class ComSeparacaoComandoConsulta {

    String atributo;
    String valor;
    public boolean atributoExiste(String nomeAtributo) {
        return true;
    }

    public void setAtributo(String atributo, String valor) {
        this.atributo = atributo;
        this.valor = valor;
    }

    public void validarAtributo() {
        if (atributoExiste("nomeUsuario")) {
            setAtributo("nomeUsuaro", "tioBob");
        }
    }
}
