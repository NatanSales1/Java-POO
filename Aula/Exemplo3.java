class Exemplo3 {
  public static void main(String[] args)
      throws java.io.IOException {

    char letra = 'N';
    char resposta;

    System.out.println("Digite uma letra entre A e Z");

    resposta = (char) System.in.read();

    if (resposta == letra) {
      System.out.println("Você acertou! A letra correta");
    } else {
      System.out.println("Errou!");
    }

  }

}