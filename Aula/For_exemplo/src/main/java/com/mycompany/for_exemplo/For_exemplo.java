package com.mycompany.for_exemplo;

public class For_exemplo {

    public static void main(String[] args) {
        int i;
        
        for(i = 0; i <= 100; i++){
            if(i % 2 == 0)
                continue;
            System.out.println("O número "+ i +" é ímpar.");
        }
    }
}
