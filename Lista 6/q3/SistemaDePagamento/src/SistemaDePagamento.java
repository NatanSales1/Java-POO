public class SistemaDePagamento {
    double taxaDeJuros = 0.02;
    final double TAXA_DE_JUROS_PADRAO = taxaDeJuros;
    
    public double calcularJuros(double reais) {
        return reais * TAXA_DE_JUROS_PADRAO;
    }
    
    public void setTaxaDeJurosPadrao(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    
    final public double calcularValorTotal(double valTransacaoFincnceira) {
        return valTransacaoFincnceira * TAXA_DE_JUROS_PADRAO; 
    }
}
