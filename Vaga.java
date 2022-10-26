import java.util.ArrayList;

public class Vaga {
    private int id;
    private String numero;
    private String tipo;
    private double tamanho;
    private float preco;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<Locacao> locacoes;

    private ArrayList<Vaga> vagas = new ArrayList<>();

    protected Vaga(int id, String numero, String tipo, double tamanho, float preco) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;

        this.veiculos = new ArrayList<>();
        this.locacoes = new ArrayList<>();

        vagas.add(this); 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ArrayList<Veiculo> getVeiculo() {
        return veiculos;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public ArrayList<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacao(Locacao locacao) {
        this.locacoes.add(locacao);
    }

    public  Vaga getVaga(int id) throws Exception {
        for (Vaga vaga : vagas) {
            if (vaga.getId() == id) {
                return vaga;
            }
        }
        throw new Exception("Vaga não encontrada");
    }

    public  void removeVaga(int id) throws Exception {
        Vaga vaga = getVaga(id);
        vagas.remove(vaga);
    }

    @Override
    public String toString() {
        return "Id=" + id + "\n"
        + "Numero=" + numero + "\n"
        + "Tipo=" + tipo + "\n"
        + "Tamanho=" + tamanho + "\n"
        + "Preco=" + preco + "\n";

    }
}

