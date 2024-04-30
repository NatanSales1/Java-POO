//package com.mycompany.questao4;

import java.util.Scanner;

class Cliente{
    private String nomeCompleto;
    
    void setNomeCompleto(String nomeCompleto){
        if(nomeCompleto.length() > 80)
            System.out.println("Nome maior do que 80 caracteres.");
        else
            this.nomeCompleto = nomeCompleto;
    }
    
    String getNomeCompleto(){
        return this.nomeCompleto;
    }
    
}

public class Questao4 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite seu nome completo: ");
        cliente.setNomeCompleto(in.next());
        
        System.out.println("Nome: " + cliente.getNomeCompleto());
    }
}
