//package com.mycompany.questao4;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor");
        int tam = input.nextInt();
        
        int vetor[] = new int[tam];
        int soma = 0;
        
        for(int i = 0; i < tam; i++){
            vetor[i] = i;
        }
        
        for(int i = 0; i < tam; i++){
            soma += vetor[i];
        }
        
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
