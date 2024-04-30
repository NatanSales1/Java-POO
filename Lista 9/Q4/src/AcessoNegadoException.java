public class AcessoNegadoException extends Exception {

    public AcessoNegadoException() {
        super();
    }
    
    void verificarAcesso(String usuario, String senha) throws AcessoNegadoException {
        if (usuario.equals("admin") && senha.equals("12345")) {
            
        } else {
            throw new AcessoNegadoException();
        }
    }
}

