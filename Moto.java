public class Moto extends Veiculo {
    private String placa;
    private int cilindrada;
    public Moto(
        int id,
        String nome,
        String placa,
        int cilindrada
        
    ) {
        super(id, nome);
        this.placa = placa;
        this.cilindrada = cilindrada;

    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public long getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
