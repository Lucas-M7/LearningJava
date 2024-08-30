import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner para receber a tecla digitada
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println("Este número é par: " + number);
        if (number % 2 != 0)
            System.out.println("Este número é ímpar: " + number);
    }
}