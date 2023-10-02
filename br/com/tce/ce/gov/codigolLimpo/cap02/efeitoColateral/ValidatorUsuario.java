package br.com.tce.ce.gov.codigolLimpo.cap02.efeitoColateral;

public class ValidatorUsuario {
    private Cripografia cripografia;
    public boolean verificarSenha(String nomeUsuario,String senha){
        Usuario user = UsuarioGatway.findPorNome(nome);
        if(user != Usuario.NULL){
            String fraseCodificada = user.getFraseCodificadaPorSenha();
            String frase = cripografia.decriptografar(fraseCodificada, senha);
            if("Valida Password".equals(frase)){
                Sessao.inicializar();
                return true;
            }
        }
        return false;
    }
}
