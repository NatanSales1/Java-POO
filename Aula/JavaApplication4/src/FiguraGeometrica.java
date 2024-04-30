public abstract class FiguraGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return base * altura;
    }
    
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

class Circulo extends FiguraGeometrica {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}



