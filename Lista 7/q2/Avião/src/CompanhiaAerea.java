
public class CompanhiaAerea {

    public static void main(String[] args) {
        Aviao aviao = new Aviao(2, 30);
        
        Aviao.adicionarAviao(27);
        Aviao.adicionarAviao(33);
        
        System.out.println("Média de passageiros por voo: " + Aviao.calcularMediaPassageiros());
        
        System.out.println("Quantidade total de aviões em serviço: " + Aviao.quantidadeAvioes);
        
    }
    
}
