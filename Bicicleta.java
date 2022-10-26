public class Bicicleta extends Veiculo{
    private String marca;
    private String cor;

    public Bicicleta(
        int id,
        String nome,
        String marca,
        String cor
        
    ) {
        super(id, nome);
        this.marca = marca;
        this.cor = cor;

    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
}
