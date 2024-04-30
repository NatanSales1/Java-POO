public class Funcionario{    
String nome;
double salario;
String departamento;
int vendas;
    
    double calcularSalario(){
        return this.salario;
    }
    
    void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
    }
    
    public class Gerente extends DemoFuncionario{
        void numeroDeFuncionariosGerenciados(){
            
        }
        
        double porcentagemDeBonus(int vendas){
             return 300 * vendas;
        }
        
        double calcularSalario(){
            return salario + porcentagemDeBonus(vendas);
        }
    }

public class DemoFuncionario {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


