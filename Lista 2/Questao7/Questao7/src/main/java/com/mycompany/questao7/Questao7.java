//package com.mycompany.questao7;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int senha; 
       
       do{
           System.out.print("Digite a senha: ");
           senha = input.nextInt();
       }
        while(senha != 1234);{ 
            if(senha == 1234)
                System.out.println("Senha correta!"); 
        } 
    }
}
