//package com.mycompany.usabrinquedo;

public class Brinquedo {
    String nome;
    String faixaEtaria;
    int preco;
    
    String getNome(){
        return nome;
    }
    
    void setNome(String nomeBrinquedo){
        nome = nomeBrinquedo;
    }
    
    String getFeixaEtaria(){
        return faixaEtaria;
    }
    
    void setFaixaEtaria(int id){
        if(id > 0){
            if(id <= 2)
                faixaEtaria = "0 a 2";
            else if(id > 3 && id <=5)
                faixaEtaria = "3 a 5";
            else if(id > 5 && id <=10)
                faixaEtaria = "6 a 10";
            else if(id > 10)
                faixaEtaria = "acima de 10";
        }else
            faixaEtaria = "Valor inválido.";
    }
    
    int getPreco(){
        return preco;
    }
    
    void setPreco(int valor){
        preco = valor; 
    }
    
    
}
