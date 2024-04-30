import java.util.Scanner;

enum Planetas {
    MERCURIO(0.38), VENUS(0.91), TERRA(1.00), MARTE(0.38), JUPITER(2.53), SATURNO(1.07), URANO(0.92), NETUNO(1.19);
    private double gravidade;
    
    Planetas(double g){
        gravidade = g;
    }
    
    double getGravidade() {
        return gravidade;
    }
}

public class Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Planetas p[] = Planetas.values();
        
        System.out.println("Digite um número de 1 a 8:");
        int escolha = in.nextInt();
        
        if(escolha >= 1 && escolha <=8)
            System.out.println("O número corresponde ao planeta " + p[escolha - 1] + " com gravidade igual a " + p[escolha - 1].getGravidade());
        else{
            System.out.println("Número de planeta inválido!");
        }
    }
}
