public class Livro {
    private static int totalLivros;
    private static int livrosEmprestados;
    
    Livro(int total, int emprestados) {
        Livro.totalLivros = total;
        Livro.livrosEmprestados = emprestados;
    }

    public static int getTotalLivros() {
        return totalLivros;
    }

    public static int getLivrosEmprestados() {
        return livrosEmprestados;
    }
    public static void adicionarLivros(int livrosAdd) {
        Livro.totalLivros += livrosAdd;
    }
    
    public static void emprestarLivro(int livrosEmprestar) {
        if(livrosEmprestar > Livro.totalLivros) {
            System.out.println("Quantidade excede a quantidade de livros no estoque.");
        }
        else {
            Livro.livrosEmprestados += livrosEmprestar;
            Livro.totalLivros -= livrosEmprestar;
        }
    }
    
    public static void devolverLivro(int livrosDevolvidos) {
        if(livrosDevolvidos > Livro.livrosEmprestados){
            System.out.println("Quantidade excede a quantidade de livros emprestados.");
        }
        else {
            Livro.livrosEmprestados -= livrosDevolvidos;
            Livro.totalLivros += livrosDevolvidos;
        }
    }
}
