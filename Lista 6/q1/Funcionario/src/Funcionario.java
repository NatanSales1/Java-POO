public abstract class Funcionario {
    public abstract double calcularSalario();
}

class Gerente extends Funcionario{
    private double salario;

    Gerente(double salario) {
        this.salario = salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalario(){
        salario += salario * 0.2;
        return salario;
    }
}

class Programador extends Funcionario{
    private double salario;
    
    Programador(double salario) {
        this.salario = salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalario(){
        salario += salario * 0.1;
        return salario;
    }
}