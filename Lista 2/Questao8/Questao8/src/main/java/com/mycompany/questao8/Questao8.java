//package com.mycompany.questao8;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, i, soma = 0;
    
       do{
          System.out.print("Digite um inteiro N: ");
          n = input.nextInt();
          
          for(i = 1; i <= n; i++){
              soma += i;
          }
          
           System.out.println("Soma dos nùmeros de 1 a N: " + soma);
       }
       while(i < n);  
    }
}
