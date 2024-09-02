public class Main {
    public static void main(String[] args) {

        int gastosJaneiro = 15000;
        int gastosFevereio = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereio + gastosMarco;
        System.out.println("O gasto total do primeiro trimeste foi: " + gastosTrimestre);

        int mediaMensal = gastosTrimestre / 3;
        System.out.println("Valor da média mensal: " + mediaMensal);
    }
}