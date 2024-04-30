public class MathUtils {
    private static int sumCounter = 0;
    private static int multiplyCounter = 0;
    
    static int sum(int n1, int n2) {
        MathUtils.sumCounter++;
        return n1 + n2;
    }
    
    static int multiply(int n1, int n2) {
        MathUtils.multiplyCounter++;
        return n1 * n2;
    }
    
    static int returnSum() {
        return MathUtils.sumCounter;
    }
    
    static int returnMultiply() {
        return MathUtils.multiplyCounter;
    }
    
    public static void main(String[] args) {        
        MathUtils.sum(7, 2);
        MathUtils.sum(75, 106);
        MathUtils.multiply(4, 8);
        
        System.out.println(MathUtils.sum(775, 136));
        System.out.println("Numero de requisições de soma: " + MathUtils.returnSum());
        System.out.println("Número de requisições de multiplicação: " + MathUtils.returnMultiply());
        
    }
}
