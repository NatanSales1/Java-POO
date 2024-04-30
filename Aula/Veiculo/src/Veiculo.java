public interface Veiculo {
    public double calcularPedagio();
}

class Carro implements Veiculo {
    //Calcula com base no numero de eixos do veiculo, cada eixo paga R$5,00
    private int numEixos; 
    
    public double calcularPedagio() {
        return 5 * this.numEixos;
    }
    
    Carro(int numEixos) {
        this.numEixos = numEixos;
    }
}

class Caminhao implements Veiculo {
    //Calcula com base no peso do veiculo, cada tonelada paga R$10,00
    private double pesoToneladas;
    
    Caminhao(double pesoToneladas) {
        this.pesoToneladas = pesoToneladas;
    }
    
    public double calcularPedagio() {
        return 10 * this.pesoToneladas;
    }
     
}