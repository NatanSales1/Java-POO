/* Victor Natan Amorim Sales
   Matrícula - 538569
    
   Raimundo Nathan Soares Rodrigues
   Matrícula - 539581
*/


class ContaBancaria{
    String cliente;
    int numConta;
    double saldo;
    
    void sacar(double saque){
        if(saque > saldo)
            System.out.println("Quantidade indisponível para saque.");
        else
            this.saldo -= saque;
    }
    
    void depositar(double deposito){
        this.saldo += deposito;
    }
    
    ContaBancaria(String nome, int numConta, double saldo){
        this.cliente = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }
}

class ContaPoupanca extends ContaBancaria{
    int diaDeRendimento;

    public ContaPoupanca(String nome, int numConta, double saldo) {
        super(nome, numConta, saldo);
    }
       
    double calcularNovoSaldo(int taxaRendimento){
        return this.saldo += taxaRendimento;
    }
}

class ContaEspecial extends ContaBancaria{
    double limite;

    void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String nome, int numConta, double saldo) {
        super(nome, numConta, saldo);
    }
    
    void sacar(double saque){
        if(saque > limite + this.saldo)
            System.out.println("Limite indisponível.");
        else
            this.saldo -= saque;
    }
}

public class Contas {

    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Natan", 777, 1000.47); 
        cb.sacar(300);
        cb.depositar(10500);
        
        ContaPoupanca cp = new ContaPoupanca("Natan", 787, 500);
        
        ContaEspecial ce = new ContaEspecial("Natan", 1443, 250);
        ce.setLimite(2000);
        
        //Testando o saque com limite da C.Especial
        ce.sacar(3000);
        System.out.println("Saldo conta Especial (com limite): R$" + ce.saldo);
        
        //Mostando novo saldo do cliente, apartir da taxa de rendimento poupança
        System.out.println("Novo saldo do cliente(C.Poupança): R$" + cp.calcularNovoSaldo(70));
        System.out.println("");
        
        //Mostrar dados das contas
        System.out.println("-----Conta Bancária-----");
        System.out.println("Nome: " + cb.cliente);
        System.out.println("Número da Conta: " + cb.numConta);
        System.out.println("Saldo: R$" + cb.saldo);
       
        System.out.println("");
        System.out.println("-----Conta Poupança-----");
        System.out.println("Nome: " + cp.cliente);
        System.out.println("Número da Conta: " + cp.numConta);
        System.out.println("Saldo: R$" + cp.saldo);
        
        System.out.println("");
        System.out.println("-----Conta Especial-----");
        System.out.println("Nome: " + ce.cliente);
        System.out.println("Número da Conta: " + ce.numConta);
        System.out.println("Saldo: R$" + ce.saldo);
    }
}
