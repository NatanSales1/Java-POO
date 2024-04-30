import java.util.Scanner;

class Personagem{
    String nome;
    int nivel;
    int experiencia;
    int saude;
    int forca;
    int inteligencia;
    int velocidade;
    
    Personagem(String nome, int lvl, int xp){
        this.nome = nome;
        this.nivel = lvl;
        this.experiencia = xp;
    }
}

class Guerreiro extends Personagem{
    
    public Guerreiro(String nome, int lvl, int xp) {
        super(nome, lvl, xp);
    }
    
    public void setSaude(int saude) {
        this.saude = 2;
        this.saude += saude; 
    }
    
    public void setForca(int forca) {
        this.forca = 3;
        this.forca += forca;
    }
    
    public void setInteligencia(int inteligencia) {
        this.inteligencia = -3;
        this.inteligencia += inteligencia;
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = -2;
        this.velocidade += velocidade;
    }
    
    void ataqueCC(int alvo){
        if(alvo == 1){
            this.saude -= 3;
        }
        else if(alvo == 2){
            this.saude -= 3;
        }
    }    
}

class Mago extends Personagem{
    
    public Mago(String nome, int lvl, int xp) {
        super(nome, lvl, xp);
    }
    
    int cura;
    
    public void setSaude(int saude) {
        this.saude = 1;
        this.saude += saude; 
    }
    
    public void setForca(int forca) {
        this.forca = 2;
        this.forca += forca;
    }
    
    public void setInteligencia(int inteligencia) {
        this.inteligencia = 4;
        this.inteligencia += inteligencia;
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = -2;
        this.velocidade += velocidade;
    }
    
    public void setCura(int cura){
        this.cura = cura;
    }
    
    boolean ataqueAD = true;
}

class Arqueiro extends Personagem{
    
    public Arqueiro(String nome, int lvl, int xp) {
        super(nome, lvl, xp);
    }
    
    public void setSaude(int saude) {
        this.saude = 1;
        this.saude += saude; 
    }
    
    public void setForca(int forca) {
        this.forca = 1;
        this.forca += forca;
    }
    
    public void setInteligencia(int inteligencia) {
        this.inteligencia = 2;
        this.inteligencia += inteligencia;
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = 3;
        this.velocidade += velocidade;
    }
    
    int fuga = 1;
}

public class JogoAventura {
    
    public static void main(String[] args) {
        Guerreiro gue = new Guerreiro("Hercules", 80, 1400);
        gue.setForca(0);
        gue.setSaude(5);
        gue.setVelocidade(5);
        gue.setInteligencia(5);
        
        Mago mago = new Mago("Dr.Strange", 65, 1880);
        mago.setForca(0);
        mago.setSaude(5);
        mago.setVelocidade(5);
        mago.setInteligencia(5);
        mago.setCura(2);
        
        
        Arqueiro arq = new Arqueiro("Zezo", 17, 22);
        arq.setForca(0);
        arq.setSaude(5);
        arq.setVelocidade(5);
        arq.setInteligencia(5);
        //deixei setado o numero de fugas do arqueiro como "1"
        
        Scanner in  = new Scanner(System.in);
        
        System.out.println("Guerreiro - 1");
        System.out.println("Mago - 2");
        System.out.println("Arqueiro - 3");
        System.out.println("Escolha um personagem:");
        int perso = in.nextInt();
        int alvo;
        
        switch(perso){
            case 1:
                System.out.println("O guerreiro possui ataque corpo a corpo, deseja atacar quem?");
                System.out.println("Mago - 1");
                System.out.println("Arqueiro - 2");
                alvo = in.nextInt();

                if(alvo == 1){
                    mago.saude -= gue.forca;
                    System.out.println("Atingiu o mago, sua saúde caiu para " + mago.saude);
                }
                else if(alvo == 2){
                    if(arq.fuga > 0){
                        arq.fuga -= 1;
                        System.out.println("O arqueiro possui habilidade de fuga, ele escapou!");
                        System.out.println("Deseja atacar novamente?");
                        System.out.println("Sim - 1");
                        System.out.println("Náo - 2");
                        alvo = in.nextInt();
                            
                            if(alvo == 1){
                                arq.saude -= gue.forca;
                                System.out.println("Atingiu o arqueiro, sua saúde caiu para " + arq.saude);
                            }
                    } else{
                        arq.saude -= gue.forca;
                        System.out.println("Atingiu o arqueiro, sua saúde caiu para " + arq.saude);
                    }       
                }
                break;
            
            case 2:
                System.out.println("O mago possui ataque a distancia e cura, deseja atacar ou curar?");
                System.out.println("Ataque a distancia - 1");
                System.out.println("Cura - 2");
                int escolha = in.nextInt();

                if(escolha == 1){
                    System.out.println("Deseja atacar quem?");
                    System.out.println("Guerreiro - 1");
                    System.out.println("Arqueiro - 2");
                    alvo = in.nextInt();

                    if(alvo == 1){
                        gue.saude -= mago.forca;
                        System.out.println("Atingiu o guerreiro, sua saúde caiu para " + gue.saude);
                    }
                    
                    else if(alvo == 2){
                        if(arq.fuga > 0){
                            arq.fuga -= 1;
                            System.out.println("O arqueiro possui habilidade de fuga, ele escapou!");
                            System.out.println("Deseja atacar novamente?");
                            System.out.println(" Sim - 1");
                            System.out.println("Náo - 2");
                            alvo = in.nextInt();
                            
                                if(alvo == 1){
                                   arq.saude -= mago.forca;
                                   System.out.println("Atingiu o arqueiro, sua saúde caiu para " + arq.saude);
                                }
                        } else{
                            arq.saude -= mago.forca;
                            System.out.println("Atingiu o arqueiro, sua saúde caiu para " + arq.saude);
                        }       
                    }
                }
                else if(escolha == 2){
                    System.out.println("Deseja curar quem?");
                    System.out.println("Guerreiro - 1");
                    System.out.println("Arqueiro - 2");
                    alvo = in.nextInt();
                    
                    if(alvo == 1){
                        gue.saude += mago.cura;
                        System.out.println("Curou o guerreiro, sua saúde subiu para " + gue.saude);
                    }
                }
                
                break;
                
                case 3:
                System.out.println("O arqueiro possui ataque a distancia, deseja atacar quem?");
                System.out.println("Guerreiro - 1");
                System.out.println("Mago - 2");
                alvo = in.nextInt();

                if(alvo == 1){
                    gue.saude -= arq.forca;
                    System.out.println("Atingiu o guerreiro, sua saúde caiu para " + gue.saude);
                }
                else if(alvo == 2){
                    mago.saude -= arq.forca;
                    System.out.println("Atingiu o mago, sua saúde caiu para " + mago.saude);
                }
                break;
        }
    }
}
