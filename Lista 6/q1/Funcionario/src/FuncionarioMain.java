public class FuncionarioMain {
    public static void main(String[] args) {
        Gerente ger = new Gerente(4000);
        System.out.println("Salário do gerente com bônus: " + ger.calcularSalario());
        
        Programador junior = new Programador(2600);
        System.out.println("Salário do programador com bônus: " + junior.calcularSalario());
    }
}
