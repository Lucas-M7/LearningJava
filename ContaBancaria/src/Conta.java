public class Conta {
    int numero;
    double saldo;
    double limite;
    Cliente titular = new Cliente();

    boolean sacar(double quantidade) {
       if (saldo < quantidade)
           return false;

        this.saldo = this.saldo - quantidade;
        return true;
    }

    void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transferePara(Conta destino, double valor) {
        boolean retirou = this.sacar(valor);

        if (!retirou) {
            return false;
        } else {
            destino.depositar(valor);
            return true;
        }
    }
}