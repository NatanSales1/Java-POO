//package com.mycompany.viajar;

import java.util.Scanner;

public class Viagem {
    String origem;
    String destino;
    int qntdParadas;
    String[] locais_de_parada;
    Scanner input = new Scanner(System.in);
    
    void setOrigem(String cidade1){
        origem = cidade1;
    }
    
    String getOrigem(){
        return origem;
    }
    
    void setDestino(String cidade2){
        destino = cidade2;
    }
    
    String getDestino(){
        return destino;
    }
    
    void setQntdParadas(){
        qntdParadas = input.nextInt();
        locais_de_parada = new String[qntdParadas];
    }
    
    void setParadas(){
        int i, paradas = qntdParadas;
        for(i = 0; i < paradas; i++){
            locais_de_parada[i] = input.next();
        }   
    }
    
    void Mostrar(){
        System.out.println("");
        System.out.println("Origem da viagem: " + getOrigem());
        System.out.println("Destino da viagem: " + getDestino());               
        System.out.println("");
        System.out.println("Paradas:");
        
        for(int i = 0; i < qntdParadas; i++){
            System.out.println("Locais de parada: " + locais_de_parada[i]);
        }
    }
    
}
