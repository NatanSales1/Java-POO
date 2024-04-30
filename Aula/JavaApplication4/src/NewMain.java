public class NewMain {
    
    public static void main(String[] args) {
        Retangulo ret  = new Retangulo(5,7);
        Circulo cir = new Circulo(2);
        
        System.out.println("Area retangulo de base - 5 e altura - 7: A = " + ret.calcularArea());
        System.out.println("Area de um circulo de raio 2: " + cir.calcularArea());
    }
}
