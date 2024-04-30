//package com.mycompany.escopo;

class EscopoV{
    int numero = 10;

    int Calcular(int numero){
        int resultado = numero * this.numero;
        int numero = numero;
        
        return resultado;
    }
}

public class Escopo {

    public static void main(String[] args) {
        EscopoV escopo = new EscopoV();
        
        System.out.println("Retorno da variável resultado: " + escopo.Calcular(5));
        
        // 1 - A variável "resultado" é de escopo local ao método Calcular();
        
        /* 2 - Escopo local ao método Calcular(), porém entra em conflito com o atributo.
           O método não pode ser compilado, pois há um argumento "número" e uma variável local
           também chamada "número", entrando ambas em conflito. */ 
    }
}
