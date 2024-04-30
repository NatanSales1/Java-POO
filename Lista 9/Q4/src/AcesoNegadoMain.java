import java.util.Scanner;

public class AcesoNegadoMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nome de usuário: ");
        String usuario = in.nextLine();

        System.out.print("Senha: ");
        String senha = in.nextLine();
        
        AcessoNegadoException acess = new AcessoNegadoException();

        try {
            acess.verificarAcesso(usuario, senha);
            System.out.println("Acesso permitido. Bem-vindo, " + usuario + "!");
        } catch (AcessoNegadoException exc) {
            System.out.println("Acesso negado.");
        }
    }

    
}