//package com.mycompany.questao6;

class Carro{
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    
    Carro(String marca, String modelo, String ano, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    
    Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = "0";
        this.cor = "preta";
    }
    
    
}

public class Questao6 {

    public static void main(String[] args) {
        Carro carro = new Carro("Porsche", "Cayene", "2023", "preta");
        
        Carro car = new Carro("Toyota", "Corolla");
    }
}
