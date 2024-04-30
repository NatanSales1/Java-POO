//package com.mycompany.questao5;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        int i = 0, soma = 0;
        int [] num = new int[1];  
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Digite um número inteiro:");
            num[i] = input.nextInt();
            soma += num[i];
            
        } while(num[i] != 0);
            System.out.println("Soma dos números digitados: " + soma);   
    }
}
