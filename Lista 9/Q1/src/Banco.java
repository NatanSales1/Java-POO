/* Crie uma classe Banco que represente uma conta bancária simples. A classe deve ter um
método sacar que aceita um valor como parâmetro e tenta realizar o saque da conta. No
entanto, trate exceções caso o valor de saque seja maior que o saldo disponível na conta ou
caso ocorra algum erro durante a transação. Exiba mensagens adequadas em caso de
exceções. Teste o método sacar em um programa principal.
*/

public class Banco {
    private double saldo;
    
    Banco(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    void Sacar(double saque) {
        try {
            if(saque > this.saldo) {
                throw new Exception("Valor de saldo não disponível.");
            }
            this.saldo -= saque;
            
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
        
}
