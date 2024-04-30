import java.util.Scanner;

enum Meses{
    JANEIRO, FEVEREIRO, MARÇO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
}

public class EnumExercicio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Meses mes[] = Meses.values();
        
        System.out.println("Escreva o número de um mës:");
        int num = in.nextInt();
     
        if(num >=1 && num <= 12){
            System.out.println("O mês selecionado foi " + mes[num - 1]);
        } else
            System.out.println("Número digitado foi inválido.");
    }
}
