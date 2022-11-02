import java.util.List;
import java.util.Scanner;

public class VagaView implements View {
    private final Repository<Locacao> locacaoRepository;
    private final Repository<Vaga> vagaRepository;
    private final Scanner scanner;

    public VagaView(Scanner scanner, Repository<Locacao> locacaoRepository,
            Repository<Vaga> vagaRepository) {
        this.scanner = scanner;
        this.vagaRepository = vagaRepository;
        this.locacaoRepository = locacaoRepository;
    }

    public void cadastrar() {
        System.out.println("Qual o numero");
        String numero = scanner.next();

        System.out.println("Qual o preco");
        Double preco = Double.parseDouble(scanner.next());

        System.out.println("Qual o tamanho");
        String tamanho = scanner.next();

        System.out.println("Qual o tipo :([C] Carro; [M] Moto; [B] Bicileta)");
        String tipo = scanner.next();

        Vaga vaga = new Vaga(numero, tamanho, preco, tipo);
        vagaRepository.add(vaga);
    }

    public void listar() {
        List<Vaga> vagas = vagaRepository.getAll();
        List<Locacao> locacoes = locacaoRepository.getAll();

        for (Vaga vaga : vagas) {
            Double total = 0d;
            for (Locacao locacao : locacoes) {
                if (locacao.getVaga().getId().equals(vaga.getId())) {
                    total += vaga.getPreco();
                }
            }
            System.out.println(vaga.getNumero() + " total=" + total);
        }

    }

    public void remover() {
        System.out.println("Informe o id da vaga:");
        Integer id = scanner.nextInt();
        try {
            this.vagaRepository.remove(id);
        } catch (Exception e) {
            System.out.println("vaga não encontrada");
        }
    }
}
