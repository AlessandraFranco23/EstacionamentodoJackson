import java.util.List;
import java.util.Scanner;

public class VagaView implements View {
    private final Repository<Vaga> vagaRepository;
    private final Scanner scanner;

    public VagaView(Scanner scanner, Repository<Vaga> vagaRepository) {
        this.scanner = scanner;
        this.vagaRepository = vagaRepository;
    }

    public void cadastrar() {
        System.out.println("Qual o numero");
        String numero = scanner.next();

        System.out.println("Qual o preco");
        Double preco = Double.parseDouble(scanner.next());

        System.out.println("Qual o tamanho");
        String tamanho = scanner.next();

        Vaga vaga = new Vaga(numero, tamanho, preco);
        vagaRepository.add(vaga);
    }

    public void listar() {
        List<Vaga> vagas = vagaRepository.getAll();
        for (Vaga vaga : vagas) {
            System.out.println(vaga);
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
