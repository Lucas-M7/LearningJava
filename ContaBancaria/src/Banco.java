public class Banco {
    public static void main(String[] args) {

        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.dono = "Lucas";
        minhaConta.saldo = 2750.35;

        System.out.println("Saldo atual: " + minhaConta.saldo);

        if (minhaConta.sacar(50000)) {
            System.out.println("\nSaque realizado com sucesso! Agora o seu saldo atual é de: " + minhaConta.saldo);
        } else {
            System.out.println("\n Não foi possível realizar o saque, pois o saldo é insuficiente.");
        }

        minhaConta.depositar(500);
        System.out.println("\nDeposito realizado com sucesso! Agora o seu saldo atual é de: " + minhaConta.saldo);
    }
}
