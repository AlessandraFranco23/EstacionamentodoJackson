public abstract class Veiculo implements Entidade {
    public Integer id;
    public String nome;

    protected Veiculo( String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Veiculo [id=" + id + " nome=" + nome + "]";
    }

}
