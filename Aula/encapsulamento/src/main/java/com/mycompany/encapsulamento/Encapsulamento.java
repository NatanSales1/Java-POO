package com.mycompany.encapsulamento;

class DemoModificador{
    private int alpha;
    private int beta;
    int gama;
    
    void setAlpha(int a){
        alpha = a;
    }
    
    int getAlpha(){
        return alpha;
    }
}

public class Encapsulamento {

    public static void main(String[] args) {
        DemoModificador obj = new DemoModificador();
        
        
        System.out.println(obj.getAlpha());
    }
}
