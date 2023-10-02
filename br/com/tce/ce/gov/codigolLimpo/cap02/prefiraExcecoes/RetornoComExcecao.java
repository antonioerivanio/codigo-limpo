package br.com.tce.ce.gov.codigolLimpo.cap02.prefiraExcecoes;

public class RetornoComExcecao {
    try{
        deletarPagina(pagina);
        registro.deletarReferencia(pagina.nome);
        configuaracaoChaves.deletarChave(pagina.nome.criaChave());
    }catch(Exception e){
        logger.log(e.getMessage());
    }
}
