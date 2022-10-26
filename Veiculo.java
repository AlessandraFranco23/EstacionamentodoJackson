import java.util.ArrayList;

public abstract class Veiculo {

    private int id;
    private String nome;
    private int idVaga;
    private Vaga vaga;
    //private ArrayList<Locacao> locacoes;


    protected Veiculo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.idVaga = vaga.getId();
        this.vaga = vaga;

        vaga.setVeiculo(this);
        //this.locacoes = new ArrayList<>();
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


    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vag) {
        this.vaga = vaga;
    }

    // public ArrayList<Locacao> getLocacoes() {
    //     return locacoes;
    // }

    // public void setLocacao(Locacao locacao) {
    //     this.locacoes.add(locacao);
    // }

    @Override
    public String toString() {
        return "Id=" + id + "\n"
            + "Nome=" + nome + "\n"
            + "Vaga=" + vaga + "\n";
    }
}