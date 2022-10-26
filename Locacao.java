import java.util.ArrayList;
public class Locacao {
    private int id;
    private String data;
    private int idVaga;
    private Vaga vaga;

    private static ArrayList<Locacao> locacoes = new ArrayList<>();

    protected Locacao(int id, String data) {
        this.id = id;
        this.data = data;
        this.idVaga = vaga.getId();
        this.vaga = vaga;

        vaga.setLocacao(this);
        locacoes.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public static ArrayList<Locacao> getLocacoes() {
        return locacoes;
    }

    public static Locacao getLocacao(int id) throws Exception {
        for (Locacao locacao : locacoes) {
            if (locacao.getId() == id) {
                return locacao;
            }
        }
        throw new Exception("Locação não encontrada");
    }

    public static void removeLocacao(int id) throws Exception {
        Locacao locacao = getLocacao(id);
        locacoes.remove(locacao);
    }

    @Override
    public String toString() {
        return "Id=" + id + "\n";
    }
}
