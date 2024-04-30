public class FiguraGeomatricaMain {

    public static void main(String[] args) {
        FormaGeometrica[] formulas = new FormaGeometrica[3];
        
        formulas[0] = new Retangulo(4,5);
        formulas[1] = new Circulo(2);
        formulas[2] = new Triangulo(5, 4, 4, 4);
        
        System.out.println("Retängulo, Circulo e Triängulo respectivamente:");
        System.out.println();
        
        for(FormaGeometrica formula : formulas) {
            System.out.println("Area:" + formula.calcularArea());
            System.out.println("Perímetro: " + formula.calculcarPerimetro());
        }
    }
    
}
