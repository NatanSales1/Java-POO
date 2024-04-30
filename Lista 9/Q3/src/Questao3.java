import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        
        try {
            System.out.println("Digite dois n�meros inteiros: ");
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int divisao = n1/n2;
            
            System.out.println("Resultado da divis�o � " + divisao);
            
        } catch(ArithmeticException exc) {
            System.out.println("N�o � poss�vel a divis�o por 0.");
        } catch (InputMismatchException exc) {
            System.out.println("N�mero inv�lido, digite um inteiro.");
        }
    }
    
}
