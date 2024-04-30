import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) 
    throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a idade:");
        
       int idade = input.nextInt();
        
    if(idade < 18){
        System.out.println("A pessoa é de menor.");
    }else if(idade >= 18){
        System.out.println("A pessoa é de maior.");
    }
        
    }
}
