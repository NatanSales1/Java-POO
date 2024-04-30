import java.util.Scanner;


public class Questao4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int num = input.nextInt();
        
        if(num % 2 == 0){
            System.out.println("O número é par.");
        }else
            System.out.println("O número é impar.");
    }
    
}


