import java.io.IOException;

public class Questao1 {

    public static void main(String[] args) 
    throws IOException {
        //Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        
        //int num = input.nextInt();
        int num = System.in.read();
        
        if(num > '0'){
            System.out.println("O número é positivo.");
        }else if(num < '0'){
            System.out.println("O número é negativo.");
        }else if(num == '0')
            System.out.println("O número é zero.");
    }
}
