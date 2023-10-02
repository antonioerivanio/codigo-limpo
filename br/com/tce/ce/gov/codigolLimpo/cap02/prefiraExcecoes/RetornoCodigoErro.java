package br.com.tce.ce.gov.codigolLimpo.cap02.prefiraExcecoes;

public class RetornoCodigoErro {
    private final static boolean E_OK = false;
    private final static boolean E_ERROR = true;
    if(deletarPagina(page) == E_OK){
        if (registrar.deletarReferencia(pagina.nome) == E_OK){
            if (configChaves.deletarChave(pagina.nome.criarChave()) == E_OK){
                logger.log("pagina excluida");
            }else{
                logger.log("deletearRefencia nao foi excluido do registro");
            }
        }else{
            logger.log("a exlusao falhou");
            return E_ERROR;
        }
    }
}
