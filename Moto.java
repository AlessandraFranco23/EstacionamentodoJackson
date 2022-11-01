public class Moto extends Veiculo {
    private String placa;
    private String cilindrada;

    public Moto(
            String nome,
            String placa,
            String cilindrada
    ) {
        super(nome);
        this.placa = placa;
        this.cilindrada = cilindrada;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String getTipo() {
        return "M";
    }

    @Override
    public String toString() {
        return "Moto [" + super.toString() + "placa=" + placa + "cilindrada=" + cilindrada + "]";
    }
}
