public class BancoMain {

    public static void main(String[] args) {
        Banco banco = new Banco(1000);
        banco.Sacar(1500);
        
        System.out.println("Saldo: R$" + banco.getSaldo());
    }
    
}
