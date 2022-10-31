import java.util.List;
import java.util.Scanner;

public class App {
    public final Repository<Veiculo> veiculoRepository = new Repository<Veiculo>();
    public final Repository<Vaga> vagaRepository = new Repository<Vaga>();
    public final Repository<Locacao> locacaoRepository = new Repository<Locacao>();
    public static void main(String[] args) {

    }

    public void cadastrarVeiculo(Scanner scanner) {
        System.out.println("Cadastrar veiculo");
        System.out.println("Informe o nome do veiculo:");
        String nome = scanner.next();
        System.out.println("Informe qual tipo de veiculo é: ([C] Carro; [M] Moto; [B] Bicileta)");
        String tipo = scanner.next();

        switch (tipo) {
            case "C":
                System.out.println("Informe a placa do carro:");
                String placa = scanner.next();
                System.out.println("Informe a cor do Carro:");
                String cor = scanner.next();
                try {
                    Carro carro = new Carro(
                            nome,
                            placa,
                            cor);
                    System.out.println("Carro cadastrado com sucesso!");
                    System.out.println(carro);
                    veiculoRepository.add(carro);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
    }

    public void listarVeiculos() {
        List<Veiculo> veiculos = this.veiculoRepository.getAll();
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    public void removerVeiculo(Scanner scanner) {
        System.out.println("Informe o id do veiculo:");
        Integer id = scanner.nextInt();
        try {
            this.veiculoRepository.remove(id);
        } catch (Exception e) {
            System.out.println("veiculo não encontrado");
        }
    }

    public void cadastrarVaga(Scanner scanner) {
        System.out.println("Qual o numero");
        String numero = scanner.next();

        System.out.println("Qual o preco");
        Double preco = Double.parseDouble(scanner.next());

        System.out.println("Qual o tamanho");
        String tamanho = scanner.next();

        Vaga vaga = new Vaga(numero, tamanho, preco);
        vagaRepository.add(vaga);
    }

    public void valorTotalVaga(Scanner scanner) {
        System.out.println("Qual o id da vaga");
        Integer id = scanner.nextInt();
        Double total = 0d;
        List<Locacao> locacoes = locacaoRepository.getAll();
        for (Locacao locacao : locacoes) {
            if (locacao.getVaga().getId().equals(id)) {
                total += locacao.getVaga().getPreco();
            }
        }
        System.out.println(total);
    }
}