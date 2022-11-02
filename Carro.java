public class Carro extends Veiculo {
    private String placa;
    private String cor;

    public Carro(
            String nome,
            String placa,
            String cor) {
        super(nome);
        Validator<Carro> placaValidator = new Validator<Carro>("(\\d{3})|([a-z]{4})");
        if (!placaValidator.isValid(placa))
            throw new IllegalArgumentException("Placa invalida");
        this.placa = placa;
        this.cor = cor;
    }

    @Override
    public String getTipo() {
        return "C";
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
