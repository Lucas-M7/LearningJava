public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;

    boolean sacar(double quantidade) {
       if (saldo < quantidade)
           return false;

        this.saldo = this.saldo - quantidade;
        return true;
    }

    void depositar(double quantidade) {
        this.saldo += quantidade;
    }
}
