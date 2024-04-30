//package com.mycompany.questao7;

class Calculadora{
    int Somar(int n1, int n2){
        return n1 + n2;
    }
    
    double Somar(double num1, double num2){
        return num1 + num2;
    }
}

public class Questao7 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int n1 = 10, n2 = 30;
        double d1 = 5.5, d2 = 17.3;
        
        calc.Somar(n1, n2);
        calc.Somar(d1, d2);
        
    }
}
