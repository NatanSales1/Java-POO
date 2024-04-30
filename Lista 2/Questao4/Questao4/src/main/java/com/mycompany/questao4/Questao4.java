//package com.mycompany.questao4;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        int i = 1;
        
        System.out.println("Digite um número inteiro: ");
        int num = n.nextInt();
        
        System.out.println("Tabuada do número " + num + ":");
        
        while(i <= 10){
            System.out.println(num + "x" + i + " = " + num * i);
            i++;
        }   
    }
}
