package com.mycompany.obj;

import java.util.Scanner;

public class Obj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o número de passageiros:");
        int numP = in.nextInt();
        
        System.out.println("Digite a capacidade do tanque:");
        int cpc = in.nextInt();
               
        System.out.println("Digite o consumo do veículo:");
        int cons = in.nextInt();
        
        Veiculo car = new Veiculo(numP, cpc, cons);
        
        car.MostrarInfos();
    }
}
