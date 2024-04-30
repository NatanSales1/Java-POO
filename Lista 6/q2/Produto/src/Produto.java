public abstract class Produto {
    
    public abstract double calcularPreco(double a, double b);
    
    public void imprimirDetalhes() {
        System.out.println("====Detalhes====");
        System.out.println("Nome: ");
        System.out.println("G�nero: ");
    }
}

class Livro extends Produto {
    private double precoBase;
    protected String nome;
    protected String genero;

    Livro(double precoBase, String nome, String genero) {
        this.precoBase = precoBase;
        this.nome = nome;
        this.genero = genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
     
    public double calcularPreco(double imposto, double desconto) {
        return precoBase += imposto - desconto;
    }
    
    public void imprimirDetalhes() {
        System.out.println("=====Detalhes do Livro=====");
        System.out.println("T�tulo: " + this.nome);
        System.out.println("G�nero: " + this.genero);
        System.out.println("Pre�o Final: R$" + calcularPreco(10.03, 2));
    }
}

class DVD extends Produto {
    private double precoBase;
    protected String nome;
    protected String genero;
    

    DVD(double precoBase, String nome, String genero) {
        this.precoBase = precoBase;
        this.nome = nome;
        this.genero = genero;
    }
    
    public double calcularPreco(double imposto, double desconto) {
        return precoBase += imposto - desconto;
    }
    
    public void imprimirDetalhes() {
        System.out.println("");
        System.out.println("=====Detalhes do Filme=====");
        System.out.println("Nome: " + this.nome);
        System.out.println("G�nero: " + this.genero);
        System.out.println("Pre�o final: R$" + calcularPreco(5, 0));
    }
}