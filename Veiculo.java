//import java.util.ArrayList;

public abstract class Veiculo {

    private int id;
    private String nome;
    //private ArrayList<Alimentacao> alimentacoes;

    protected Veiculo(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}