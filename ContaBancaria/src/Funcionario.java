public class Funcionario {

    public String nome;
    public int idade;
    public String departamento;
    public double salario;
    Data dataDeEntrada = new Data();
    public  String rg;
    public boolean estaNaEmpresa;
    public boolean estaDeFerias;

    public void consultarFuncionario() {
        System.out.println("\nCONSULTA DO USUÁRIO: \n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Está na empresa? " + this.estaNaEmpresa);
        System.out.println("Está de férias? " + this.estaDeFerias);
        System.out.println("Data de entrada ao banco: " + this.dataDeEntrada.formatarData());
    }

    public void consultarSalario() {
        System.out.println("\nO seu salário atual é de: " + this.salario);
    }

    public void receberAumento(double aumento) {
        salario += aumento;

        System.out.println("O seu salário foi aumentado em: " + aumento);
        System.out.println("Agora o seu salário atual é: " + this.salario);
    }

    public double calcularGanhoAnual() {
        return this.salario * 12;
    }
}