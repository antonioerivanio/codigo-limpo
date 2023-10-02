package br.com.tce.ce.gov.codigolLimpo.cap02.prefiraExcecoes;

public class TratamentoCorretoErroMetodoComExcecao {
    public void deletar(Pagina pagina){
        try{
            deletarPaginaAndTodasReferecias(pagina);
        }catch (Exception e){
            getLogError(e);
        }
    }

    private void deletarPaginaAndTodasReferecias(Pagina pagina) throws Exception{
        deletarPagina(pagina);
        registro.deletarRefencia(pagina.nome);
        configurarChaves.deletarChave(pagina.nome.criarChave());
    }

    private static void getLogError(Exception e) {
        logger.log(e.getMessage());
    }
}
