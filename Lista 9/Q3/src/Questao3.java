import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        
        try {
            System.out.println("Digite dois números inteiros: ");
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int divisao = n1/n2;
            
            System.out.println("Resultado da divisão é " + divisao);
            
        } catch(ArithmeticException exc) {
            System.out.println("Não é possível a divisão por 0.");
        } catch (InputMismatchException exc) {
            System.out.println("Número inválido, digite um inteiro.");
        }
    }
    
}
