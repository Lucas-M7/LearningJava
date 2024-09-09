public class Fibonacci {
    public static int calcularFibonacci (int n) {
        return n <= 1 ? n : calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int resultado = calcularFibonacci(i);
            System.out.println(resultado);
        }
    }
}