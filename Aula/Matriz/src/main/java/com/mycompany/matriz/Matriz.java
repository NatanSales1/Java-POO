package com.mycompany.matriz;

public class Matriz {

    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int maior = 0, menor = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > maior){
                maior = nums[i];
            }
        }
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < menor){
                menor = nums[i];
            }
        }
        
        System.out.println("Valor máximo: " + maior);
        System.out.println("Valor mínimo: " + menor);
    }
}
