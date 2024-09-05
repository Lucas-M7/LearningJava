public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario primeiroFuncionario = new Funcionario();

        primeiroFuncionario.nome = "Bob Chert";
        primeiroFuncionario.idade = 35;
        primeiroFuncionario.departamento = "TI";
        primeiroFuncionario.salario = 5250.85;
        primeiroFuncionario.entradaNoBanco = "7/5/2014";
        primeiroFuncionario.estaNaEmpresa = true;
        primeiroFuncionario.estaDeFerias = true;

        primeiroFuncionario.consultarFuncionario();
        primeiroFuncionario.consultarSalario();

        primeiroFuncionario.receberAumento(1000);
        primeiroFuncionario.calcularGanhoAnual();
    }
}
