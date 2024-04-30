public interface Livro {
    void exibirDetalhes(); 
}

class Romance implements Livro {
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("ROMANCE:");
        System.out.println("Narrativa longa, ambientação temporal, e escrita em prosa.");
    }
}

class Biografia implements Livro {
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("BIOGRAFIA:");
        System.out.println("Informações como o nome, data de nascimento e morte, principais contribuições, invenções, vida pessoal, casamento e filhos");
    }
}

class LivroInfantil implements Livro {
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("LIVRO INFANTIL:");
        System.out.println("Gênero de fábula, não muito longo, sempre passa uma lição.");
    }
}