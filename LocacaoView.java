import java.util.List;
import java.util.Scanner;

public class LocacaoView implements View {

    private final Repository<Locacao> locacaoRepository;
    private final Repository<Vaga> vagaRepository;
    private final Repository<Veiculo> veiculoRepository;
    private final Scanner scanner;

    public LocacaoView(Scanner scanner, Repository<Locacao> locacaoRepository, 
    Repository<Vaga> vagaRepository,
    Repository<Veiculo> veiculoRepository) {
        this.scanner = scanner;
        this.locacaoRepository = locacaoRepository;
        this.vagaRepository = vagaRepository;
        this.veiculoRepository = veiculoRepository;
    }

    public void cadastrar() throws Exception {
        System.out.println("Informe o id da vaga:");
        Integer idVaga = scanner.nextInt();

        System.out.println("Informe o id do veiculo:");
        Integer idVeiculo = scanner.nextInt();

        System.out.println("Informe a data de locacao:");
        String dataLocacao = scanner.next();

        Vaga vaga = vagaRepository.get(idVaga);
        Veiculo veiculo = veiculoRepository.get(idVeiculo);

        Locacao locacao = new Locacao();
        if (!veiculo.getTipo().equals(vaga.getTipo())) 
            throw new Exception("Veiculo indevido pelo tipo da vaga");  
        locacao.locar(veiculo, vaga, dataLocacao);

        locacaoRepository.add(locacao);
        System.out.println("Locação salva com sucesso!");
    }

    public void listar() {
        List<Locacao> locacoes = locacaoRepository.getAll();
        for (Locacao locacao : locacoes) {
            System.out.println(locacao);
        }
    }

    public void remover() {
        System.out.println("Informe o id da locacao:");
        Integer id = scanner.nextInt();

        try {
            locacaoRepository.remove(id);
        } catch (Exception e) {
            System.out.println("locacao não encontrada!");
        }

    }
}
