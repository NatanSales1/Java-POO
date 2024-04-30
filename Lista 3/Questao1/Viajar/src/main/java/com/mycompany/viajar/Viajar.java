//package com.mycompany.viajar;

import java.util.Scanner;

public class Viajar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Viagem viagem = new Viagem();
        
        System.out.println("Digite o local de origem da viagem: ");
        String origem = input.nextLine();
        viagem.setOrigem(origem);
        
        System.out.println("Digite o local de destino da viagem: ");
        String destino = input.nextLine();
        viagem.setDestino(destino);
        
        System.out.println("Digite o número de paradas: ");
        viagem.setQntdParadas();
        
        System.out.println("Digite os locais de parada: ");
        viagem.setParadas();
        
        viagem.Mostrar();    
    }
}
