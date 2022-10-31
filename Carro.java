public class Carro extends Veiculo {
    private String placa;
    private String cor;

    public Carro(
            String nome,
            String placa,
            String cor
    ) {
        super( nome);
        this.placa = placa;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro [" + super.toString() + "placa=" + placa + "cor=" + cor + "]";
    }


    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
