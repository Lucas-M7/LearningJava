public class TestarCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.cor = "Preto";
        meuCarro.modelo = "Golf GTR";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 210;
        meuCarro.motor.tipo = "O melhor";
        meuCarro.motor.potencia = 770;

        meuCarro.ligar();

        meuCarro.acelerar(20);
        System.out.println("A velocidade atual do seu carro é: " + meuCarro.velocidadeAtual + "KM/H");
    }
}
