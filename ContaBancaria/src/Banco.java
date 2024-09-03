public class Banco {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.titular.nome = "Lucas";
        minhaConta.saldo = 2750.35;

        Conta suaConta = new Conta();

        suaConta.titular.nome = "Fábio";
        suaConta.saldo = 2750.35;

        System.out.println("Saldo atual: " + minhaConta.saldo);

        /*
        if (minhaConta.sacar(50000)) {
            System.out.println("\nSaque realizado com sucesso! Agora o seu saldo atual é de: " + minhaConta.saldo);
        } else {
            System.out.println("\n Não foi possível realizar o saque, pois o saldo é insuficiente.");
        }

        minhaConta.depositar(500);
        System.out.println("\nDeposito realizado com sucesso! Agora o seu saldo atual é de: " + minhaConta.saldo);
         */

        if (minhaConta.transferePara(suaConta, 500)) {
            System.out.println("\nTransferência realizada com sucesso!");
            System.out.println(minhaConta.titular.nome  + " Agora o seu saldo atual é de: " + minhaConta.saldo);
            System.out.println(suaConta.titular.nome + " E agora o seu saldo atual é de: " + suaConta.saldo);
        } else {
            System.out.println("\nNão foi possível realizar a transferência.");
        }
    }
}
