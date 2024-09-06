public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario primeiroFuncionario = new Funcionario();
        Data data = new Data();

        primeiroFuncionario.nome = "Bob Chert";
        primeiroFuncionario.idade = 35;
        primeiroFuncionario.departamento = "TI";
        primeiroFuncionario.salario = 5250.85;
        primeiroFuncionario.dataDeEntrada.dia = data.dia = 7;
        primeiroFuncionario.dataDeEntrada.mes = data.mes = 5;
        primeiroFuncionario.dataDeEntrada.ano = data.ano = 2017;
        primeiroFuncionario.estaNaEmpresa = true;
        primeiroFuncionario.estaDeFerias = true;

        primeiroFuncionario.consultarFuncionario();
        primeiroFuncionario.consultarSalario();

        primeiroFuncionario.receberAumento(1000);
        primeiroFuncionario.calcularGanhoAnual();

        // Funcionario segundoFuncionario = primeiroFuncionario;

        /*
        segundoFuncionario.nome = "Bob Chert";
        segundoFuncionario.idade = 35;
        segundoFuncionario.departamento = "TI";
        segundoFuncionario.salario = 5250.85;
        segundoFuncionario.entradaNoBanco = "7/5/2014/";
        segundoFuncionario.estaNaEmpresa = true;
        segundoFuncionario.estaDeFerias = true;
         */

        /*
        if (primeiroFuncionario == segundoFuncionario) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentess dos iguais");
        }
         */
    }
}
