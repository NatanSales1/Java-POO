import java.io.IOException;

public class Help {
  public static void main(String[] args)

      throws IOException {

    System.out.println("Ajuda do sistema:");
    System.out.println("  1. if");
    System.out.println("  2. switch");
    System.out.println("Escolha uma:");

    int escolha = System.in.read();

    if (escolha == '1') {
      System.out.println("A sintaxe da estrutura if é:");
      System.out.printf("\nif(condição) { \n instrução;\n} \nelse { \n instrução }");

    } else if (escolha == '2') {
      System.out.printf("A sintaxe da estrutura switch é:");
      System.out.printf(
          "\nswitch (expressão) { \n  case(constante1): \n   bloco de instruções/n break; \n  default: \n   bloco de instruções \n}");
    }

  }
}