//package com.mycompany.questao9;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        double sqrt;
        
        do{
            System.out.print("Digite um número inteiro: ");
            num = input.nextInt();
            sqrt = Math.ceil(Math.sqrt(num));
            
            if(Math.pow(sqrt, 2) == num)
                System.out.println("O número " + num + " é um quadrado perfeito");
            else{
                System.out.println("O número " + num + " não é um quadrado perfeito.");
                System.out.println("");
            }
            
        }while(Math.pow(sqrt, 2) != num);
    }
}
