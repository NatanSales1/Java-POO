import java.util.Scanner;

enum DiasSemana {
    SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
}

public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        DiasSemana dia[] = DiasSemana.values();
        
        System.out.println("Digite um número de 1 a 7:");
        int escolha = in.nextInt();

        
        if(escolha >= 1 && escolha <=7){
            System.out.println("O número digitado corresponde a " + dia[escolha - 1]);
            if(escolha >= 1 && escolha <= 5)
                System.out.println("Dia útil.");
            else
                System.out.println("Dia NÃO útil.");
        }else{  
            System.out.println("Número de dia inválido!");
        }
    }
}
