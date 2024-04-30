public class MotoristaMain {

    public static void main(String[] args) {
        Motorista m1 = new MotoristaOnibus("Sergio", 2500);
        Motorista m2 = new MotoristaCaminhao("Sejux", 2500, 720);
        
        System.out.println("Nome do motorista de onibus: " + m1.getNome());
        System.out.println("Salário: " + m1.calcularSalarioLiquido());
        
        System.out.println("Nome do motorista de caminhão: " + m2.getNome());
        System.out.println("Salário: " + m2.calcularSalarioLiquido());
    }

}
