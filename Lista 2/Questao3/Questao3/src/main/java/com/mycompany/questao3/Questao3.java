//package com.mycompany.questao3;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o número de alunos da turma:");
        int qntd = input.nextInt();
        
        int soma = 0;
        int [] notas = new int[qntd];
        
        for(i = 0; i < qntd; i++){
            System.out.println("Digite a nota do " + (i + 1) + "° aluno: ");
            notas[i] = input.nextInt();
        }
        
        for(i = 0; i < qntd; i++){
            soma += notas[i];
        }
        
        int media = soma / qntd;
        
        System.out.println("A média é " + media);
    }
}
