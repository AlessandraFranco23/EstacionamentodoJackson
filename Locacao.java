public class Locacao implements Entidade {
    private Integer id;
    private String data;
    private Veiculo veiculo;
    private Vaga vaga;

    public void locar(Veiculo veiculo, Vaga vaga, String dataLocacao) {
        this.data = dataLocacao;
        this.veiculo = veiculo;
        this.vaga = vaga;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Vaga getVaga() {
        return this.vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    @Override
    public String toString() {
        return "Locacao [ Id=" + id + "\n"
                + "Data=" + data + "\n"
                + "Veiculo=" + veiculo + "\n"
                + "Vaga=" + vaga + "]";
    }
}
