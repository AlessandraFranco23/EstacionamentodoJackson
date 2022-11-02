public class Vaga implements Entidade {
    private Integer id;
    private String numero;
    private String tamanho;
    private Double preco;

    public Vaga(String numero, String tamanho, Double preco) {
        
        Validator<Vaga> placaValidator = new Validator<Vaga>("(\\d{3})|([a-z]{1})");
        if (!placaValidator.isValid(numero))
            throw new IllegalArgumentException("Número da vaga invalida");
        this.numero = numero;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Vaga [Id=" + id + "\n"
                + "Numero=" + numero + "\n"
                + "Tamanho=" + tamanho + "\n"
                + "Preco=" + preco + "\n"
                + "]";
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
