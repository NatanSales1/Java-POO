//package com.mycompany.questao5;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int matriz[][] = new int[3][3];
        int i, j, somaDiagonal = 0;
        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz.length; j++){
                System.out.println("Insira um valor para a posição["+(i + 1)+"],["+(j + 1)+"]");
                matriz[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Matriz: ");
        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz.length; j++){
                if(i == j)
                    somaDiagonal += matriz[i][j];
            }
        }
        
        System.out.println("Soma da diagonal principal: " + somaDiagonal);
    }
}
