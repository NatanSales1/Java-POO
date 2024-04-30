public abstract class Produto {
    
    public abstract double calcularPreco(double a, double b);
    
    public void imprimirDetalhes() {
        System.out.println("====Detalhes====");
        System.out.println("Nome: ");
        System.out.println("Gênero: ");
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
        System.out.println("Título: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Preço Final: R$" + calcularPreco(10.03, 2));
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
        System.out.println("Gênero: " + this.genero);
        System.out.println("Preço final: R$" + calcularPreco(5, 0));
    }
}