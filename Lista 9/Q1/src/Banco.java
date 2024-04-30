/* Crie uma classe Banco que represente uma conta banc�ria simples. A classe deve ter um
m�todo sacar que aceita um valor como par�metro e tenta realizar o saque da conta. No
entanto, trate exce��es caso o valor de saque seja maior que o saldo dispon�vel na conta ou
caso ocorra algum erro durante a transa��o. Exiba mensagens adequadas em caso de
exce��es. Teste o m�todo sacar em um programa principal.
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
                throw new Exception("Valor de saldo n�o dispon�vel.");
            }
            this.saldo -= saque;
            
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
        
}
