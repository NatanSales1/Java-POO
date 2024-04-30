package com.mycompany.obj;

class Veiculo {
    int numPassag;
    int capacComb;
    int consumo;
    
    Veiculo(int n1, int n2, int n3){
        numPassag = n1;
        capacComb = n2;
        consumo = n3;
    }
    
    public int getNumPassag(){
        return numPassag;
    }
    
    public int getCapacComb(){
        return capacComb;
    }
    
    public int getConsumo(){
        return consumo;
    }
    
    public int getAutonomia(){
        return (this.capacComb * this.consumo);
    }
    
    void MostrarInfos(){
        System.out.println("=========================");
        System.out.println("Número de Passageiros: " + getNumPassag());
        System.out.println("Capacidade do tanque: " + getCapacComb() + "L");
        System.out.println("Consumo: " + getConsumo() + "Km/l");
        System.out.println("Autonomia pai: " + getAutonomia() + "Km"); 
    }
}