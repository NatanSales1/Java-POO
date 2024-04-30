
public class EstruturaSwitch {
  public static void main(String[] args)
      throws IOException {

    System.out.println("Digite uma letra:");
    char letra = (char) System.in.read();

    switch (letra) {
      case 'a':
        System.out.println("Você digitou a letra 'a'");
        break;
      case 'b':
        System.out.println("Vocë digitou a letra 'b'");
        break;

      case 'c':
        System.out.println("Vocë digitou a letra 'c'");
        break;

      default:
        System.out.println("Letra");
    }

  }

}
