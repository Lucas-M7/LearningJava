public class Data {
    int dia;
    int mes;
    int ano;

    public String formatarData() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
}
