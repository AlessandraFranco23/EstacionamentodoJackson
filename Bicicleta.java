import java.util.ArrayList;

public class Bicicleta extends Veiculo{
    private String marca;
    private String cor;

    private static ArrayList<Bicicleta> bicicletas = new ArrayList<>();

    public Bicicleta(
        int id,
        String nome,
        String marca,
        String cor
        
    ) {
        super(id, nome);
        this.marca = marca;
        this.cor = cor;

        bicicletas.add(this);

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

    public static ArrayList<Bicicleta> getBicicleta() {
        return bicicletas;
    }

    public static Bicicleta getBicicleta(int id) throws Exception {
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getId() == id) {
                return bicicleta;
            }
        }
        throw new Exception("Bicicleta não encontrado");
    }

    public static void removeBicicleta(int id) throws Exception {
        Bicicleta bicicleta = getBicicleta(id);
        bicicletas.remove(bicicleta);
    }

    @Override
    public String toString() {
        return super.toString() + "Marca =" + marca + "\n"
        + "Cor=" + cor + "\n";
    }
}
