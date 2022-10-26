import java.util.ArrayList;

public class Moto extends Veiculo {
    private String placa;
    private int cilindrada;

    private static ArrayList<Moto> motos = new ArrayList<>();

    public Moto(
        int id,
        String nome,
        String placa,
        int cilindrada
        
    ) {
        super(id, nome);
        this.placa = placa;
        this.cilindrada = cilindrada;

        motos.add(this);

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

    public static ArrayList<Moto> getMoto() {
        return motos;
    }

    public static Moto getMoto(int id) throws Exception {
        for (Moto moto : motos) {
            if (moto.getId() == id) {
                return moto;
            }
        }
        throw new Exception("Moto não encontrado");
    }

    public static void removeMoto(int id) throws Exception {
        Moto moto = getMoto(id);
        motos.remove(moto);
    }


    @Override
    public String toString() {
        return super.toString() + "Placa=" + placa + "\n"
        + "Cilindrada=" + cilindrada + "\n";
    }
}
