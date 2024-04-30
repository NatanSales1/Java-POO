//package com.mycompany.questao5;

import java.util.Scanner;

class Retangulo{
    private double base;
    private double altura;
    
    Retangulo(){
        base = 0.0;
        altura = 0.0;   
    }
    
    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
}

public class Questao5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite os valores da base e altura do retângulo: ");
        double base = in.nextDouble();
        double altura = in.nextDouble();
        
        Retangulo inicia = new Retangulo(base, altura);
    }
}
