public class Bicicleta extends Veiculo {
    private String marca;
    private String cor;

    public Bicicleta(
            String nome,
            String marca,
            String cor) {
        super(nome);
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getTipo() {
        return "B";
    }

    @Override
    public String toString() {
        return "Bicicleta [" + super.toString() + "marca=" + marca + "cor=" + cor + "]";
    }
}
