public interface Livro {
    void exibirDetalhes(); 
}

class Romance implements Livro {
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("ROMANCE:");
        System.out.println("Narrativa longa, ambienta��o temporal, e escrita em prosa.");
    }
}

class Biografia implements Livro {
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("BIOGRAFIA:");
        System.out.println("Informa��es como o nome, data de nascimento e morte, principais contribui��es, inven��es, vida pessoal, casamento e filhos");
    }
}

class LivroInfantil implements Livro {
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("LIVRO INFANTIL:");
        System.out.println("G�nero de f�bula, n�o muito longo, sempre passa uma li��o.");
    }
}