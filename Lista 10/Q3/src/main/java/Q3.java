import java.util.Scanner;

enum Jogos {
    AVENTURA("GTA 6", 3000, "pc, ps5, xbox"),
    ESTRATÉGIA("Clash of Clans", 250, "mobile"),
    RPG("The Witcher", 500, "pc"),
    CORRIDA("Forza", 1000, "ps4, xbox, nintendo"), 
    FPS("CSGO", 2000, "pc");
    
    private String nome;
    private int maxJogadores;
    private String plataformas;;;
    
    Jogos(String nome, int maxJogadores, String plataformas) {
        this.nome = nome;
        this.maxJogadores = maxJogadores;
        this.plataformas = plataformas;
    }
    
    public String getNome() {
        return this.nome;
    }

    public int getMaxJogadores() {
        return this.maxJogadores;
    }
    
    public String getPlataformas() {
        return this.plataformas;
    }
}

public class Q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Categorias disponíveis de jogos: ");
        Jogos jogos[] = Jogos.values();
        
        for(Jogos j : jogos)
            System.out.println(j);
        
        System.out.println();
       
        System.out.println("Digite uma categoria de jogo: ");
        String categoria = in.nextLine();
        
        System.out.println("INFORMAÇÕES DO JOGO ESCOLHIDO: ");
        System.out.println("Categoria: " + Jogos.valueOf(categoria));
        System.out.println("Nome: " + Jogos.valueOf(categoria).getNome());
        System.out.println("Número máximo de Jogadores: " + Jogos.valueOf(categoria).getMaxJogadores());
        System.out.println("Plataformas: " + Jogos.valueOf(categoria).getPlataformas());    
    }
}
