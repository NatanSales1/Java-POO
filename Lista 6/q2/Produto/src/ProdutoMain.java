public class ProdutoMain {
    public static void main(String[] args) {
        Livro liv = new Livro(89, "Book", "A��o");
        liv.imprimirDetalhes();        
        
        DVD filme = new DVD(40, "Interestelar", "Sci-Fi");
        filme.imprimirDetalhes();
    }
}
