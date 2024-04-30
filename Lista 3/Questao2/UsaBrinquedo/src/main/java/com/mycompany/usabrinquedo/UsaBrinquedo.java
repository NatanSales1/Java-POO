//package com.mycompany.usabrinquedo;

import java.util.Scanner;

public class UsaBrinquedo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Brinquedo brinquedo = new Brinquedo();
        
        System.out.println("Digite o NOME do brinquedo");
        String nome = input.nextLine();
        brinquedo.setNome(nome);
        
        System.out.println("Digite a FAIXA ETÁRIA do brinquedo");
        int faixaEtaria = input.nextInt();
        brinquedo.setFaixaEtaria(faixaEtaria);
        
        System.out.println("Digite o PREÇO do brinquedo");
        int preco = input.nextInt();
        brinquedo.setPreco(preco);
        
        System.out.printf("\n-----Brinquedo----\n");
        System.out.println("Nome: " + brinquedo.getNome());
        System.out.println("Faixa etária: " + brinquedo.getFeixaEtaria());
        System.out.println("Preço: R$" + brinquedo.getPreco());
    }
}
