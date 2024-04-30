public interface FormaGeometrica {
    double calcularArea();
    double calculcarPerimetro();
}

class Retangulo implements FormaGeometrica {
    private double largura, altura;
    
    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calculcarPerimetro() {
        return  2 * (largura + altura);
    }
}

class Circulo implements FormaGeometrica {
    private double raio;
    
    Circulo(double raio) {
        this.raio = raio;
    }
    
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calculcarPerimetro() {
        return  2 * Math.PI * raio;
    }
}

class Triangulo implements FormaGeometrica {
    private double base, lado2, lado3, altura;
    
    Triangulo(double base, double lado2, double lado3, double altura) {
        this.base = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    } 
    
    public double calcularArea() {
        return this.base * Math.pow(base, altura);
    }

    public double calculcarPerimetro() {
        return base + lado2 + lado3;
    }
}