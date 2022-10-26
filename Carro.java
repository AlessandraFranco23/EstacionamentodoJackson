public class Carro extends Veiculo{
    private String placa;
    private String cor;
    public Carro(
        int id,
        String nome,
        String placa,
        String cor
        
    ) {
        super(id, nome);
        this.placa = placa;
        this.cor = cor;

    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
}
