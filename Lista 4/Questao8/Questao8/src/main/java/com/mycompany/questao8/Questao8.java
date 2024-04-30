//package com.mycompany.questao8;

import java.util.Scanner;

class Relogio{
    int hora;
    int minuto;
    int segundo;
    
    void setHora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    void setHora(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 1;
    }
    
    void setHora(int hora){
        this.hora = hora;
        this.minuto = 1;
        this.segundo = 1;
    }
}

public class Questao8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite a hora, minuto e segundo: ");
        int h = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        
        Relogio hr = new Relogio();
        
        hr.setHora(h, m, s);
        hr.setHora(h, m);
        hr.setHora(h);
    }
}
