//package com.mycompany.questao6;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       int i, cont = 0, num; 
       
       while(cont < 3){ 
       
           System.out.print("Digite um número: ");
           num = input.nextInt();

           for (i = 1; i <= num; i++){
               if(num % i == 0){
                   cont++;
                }
            }
            if(cont == 2){
                System.out.println("O número "+ num +" é primo.");
                break;
            }     
            else
                System.out.println("O número "+ num +" não é primo.");
                System.out.println("");
            
            cont = 0;
        } 
    }
}
