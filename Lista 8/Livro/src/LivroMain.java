public class LivroMain {

    public static void main(String[] args) {
        
        Livro livros[] = new Livro[3];
        
        livros[0] = new Romance();
        livros[1] = new Biografia();
        livros[2] = new LivroInfantil();
        
        for(Livro livro : livros) {
            livro.exibirDetalhes();
        }
    }
    
}
