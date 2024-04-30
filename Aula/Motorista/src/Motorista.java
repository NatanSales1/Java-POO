public abstract class Motorista {
    private String nome;
    private double salarioBase;
    
    Motorista(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    abstract double calcularSalarioLiquido();
}

class MotoristaOnibus extends Motorista {
    
    public MotoristaOnibus(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    double calcularSalarioLiquido() {
        return getSalarioBase();
    }
     
}

class MotoristaCaminhao extends Motorista {
    public double cargaTransportada;
    
    public MotoristaCaminhao(String nome, double salarioBase, double cargaTransportada) {
        super(nome, salarioBase);
        this.cargaTransportada = cargaTransportada;
    }
    
    double calcularSalarioLiquido() {
        return getSalarioBase() + (this.cargaTransportada * 0.25);
    }    
    
}