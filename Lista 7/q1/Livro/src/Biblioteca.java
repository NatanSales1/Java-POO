public class Biblioteca {
    
    public static void main(String[] args) {
        Livro livro = new Livro(15, 4);
        
        Livro.adicionarLivros(4); 
        System.out.println("Quantidade total de livros no estoque: " + Livro.getTotalLivros());
        System.out.println("Quantidede de livros emprestados: " + Livro.getLivrosEmprestados());
        
        Livro.emprestarLivro(2);
        System.out.println();
        System.out.println("Quantidade total de livros no estoque: " + Livro.getTotalLivros());
        System.out.println("Quantidede de livros emprestados: " + Livro.getLivrosEmprestados());
        
        Livro.emprestarLivro(20);
        Livro.devolverLivro(3);
        System.out.println("Quantidade total de livros no estoque: " + Livro.getTotalLivros());
        System.out.println("Quantidede de livros emprestados: " + Livro.getLivrosEmprestados());
    }
    
}
