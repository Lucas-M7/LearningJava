import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numberOne = scanner.nextDouble();

        System.out.println("Digite o segunto número: ");
        double numberTwo = scanner.nextDouble();

        double sum = numberOne + numberTwo;
        double subtract = numberOne - numberTwo;
        double multiply = numberOne * numberTwo;
        double division = numberOne / numberTwo;

        System.out.println("\nSoma: " + sum);
        System.out.println("Subtração: " + subtract);
        System.out.println("Multiplicação: " + multiply);
        System.out.println("Divisão: " + division);
    }
}