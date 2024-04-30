//package com.mycompany.cbancaria;

import java.util.Scanner;

class ContaBancaria{
    private int saldo = 0;
    private int limite = 3000;
    
    int getSaldo(){
        return saldo;
    }
    
    int getLimite(){
        return limite;
    }
    
    void Depositar(int deposito){
        saldo += deposito;
    }
    
    void Saque(int saque){
        if(saque > this.saldo)
            System.out.println("Não há saldo disponível para saque.");
        else
            saldo -= saque;
    }
}

public class CBancaria {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ContaBancaria cb = new ContaBancaria();
        
        System.out.print("Deposite um valor na sua conta: ");
        cb.Depositar(in.nextInt());
        System.out.println("Saldo atual: " + cb.getSaldo());
        System.out.println("");
        
        System.out.println("Digite um valor para saque: ");
        cb.Saque(in.nextInt());
        System.out.println("Saldo atual: " + cb.getSaldo());
        System.out.println("Limite: " + cb.getLimite());
        
    }
}
