package com.mycompany.exceptiondivpor0;

public class ExceptionDivPor0 {

    public static void main(String[] args) {
        try {
            int divisao = 3/0;
            System.out.println(divisao);
            
        } catch(ArithmeticException exc) {
            System.out.println("Não é possível a divisão por 0.");
        }
        
    }
}
