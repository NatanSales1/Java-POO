//package com.mycompany.questao2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe 10 números inteiros:");
        
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        int n6 = input.nextInt();
        int n7 = input.nextInt();
        int n8 = input.nextInt();
        int n9 = input.nextInt();
        int n10 = input.nextInt();
        
        int media = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;
        
        System.out.println("A média é " + media);
        
    }
}
