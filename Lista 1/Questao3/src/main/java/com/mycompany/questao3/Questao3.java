import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int num1 = input.nextInt();
        
        System.out.println("Digite o segundo número");
        int num2 = input.nextInt();
    
        if(num1 > num2){
            System.out.println("O primeiro número é maior");
        }else
            System.out.println("O segundo número é maior");
    }
    
}
