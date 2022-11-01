import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Repository<Veiculo> veiculoRepository = new Repository<Veiculo>();
        Repository<Vaga> vagaRepository = new Repository<Vaga>();
        Repository<Locacao> locacaoRepository = new Repository<Locacao>();

        while (true) {
            System.out.println("Qual menu deseja:");
            System.out.println("[1] Veiculos\n[2] Vaga\n[3] Locação");
            String menu = scanner.next();

            View view = null;
            if ("1".equals(menu))
                view = new VeiculoView(scanner, veiculoRepository);

            if ("2".equals(menu))
                view = new VagaView(scanner, vagaRepository);

            if ("3".equals(menu))
                view = new LocacaoView(scanner, locacaoRepository, vagaRepository, veiculoRepository);

            if (Objects.isNull(view)) {
                System.out.println("Opção invalida");
                continue;
            }

            System.out.println("O que deseja fazer?");
            System.out.println("[1] Cadastrar\n" +
                    "[2] Listar \n" +
                    "[3] Remover\n");

            String opcao = scanner.next();
            switch (opcao) {
                case "1":
                    view.cadastrar();
                    break;
                case "2":
                    view.listar();
                    break;
                case "3":
                    view.remover();
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }

    // public void valorTotalVaga(Scanner scanner) {
    // System.out.println("Qual o id da vaga");
    // Integer id = scanner.nextInt();
    // Double total = 0d;
    // List<Locacao> locacoes = locacaoRepository.getAll();
    // for (Locacao locacao : locacoes) {
    // if (locacao.getVaga().getId().equals(id)) {
    // total += locacao.getVaga().getPreco();
    // }
    // }
    // System.out.println(total);
    // }
}