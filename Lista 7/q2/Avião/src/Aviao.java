public class Aviao {
    protected static int quantidadeAvioes;
    protected static int somaPassageiros;
    
    Aviao(int qntdAvioes, int somaPassag){
        Aviao.quantidadeAvioes = qntdAvioes;
        Aviao.somaPassageiros = somaPassag;
    }
    
    public static void adicionarAviao(int qntdPassageiros) {
        Aviao.quantidadeAvioes++;
        Aviao.somaPassageiros += qntdPassageiros;
    }
    
    public static int calcularMediaPassageiros() {
        if(Aviao.quantidadeAvioes == 0)
            return 0;
        else 
            return Aviao.somaPassageiros / Aviao.quantidadeAvioes;
    }
}
