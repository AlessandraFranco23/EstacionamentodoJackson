import java.util.List;
import java.util.Scanner;

public class VeiculoView implements View {
    private final Repository<Veiculo> veiculoRepository;
    private final Scanner scanner;
    
    public VeiculoView(Scanner scanner, Repository<Veiculo> veiculoRepository) {
        this.scanner = scanner;
        this.veiculoRepository = veiculoRepository;
    }

    public void cadastrar() {
        System.out.println("Cadastrar veiculo");
        System.out.println("Informe o nome do veiculo:");
        String nome = scanner.next();
        System.out.println("Informe qual tipo de veiculo é: ([C] Carro; [M] Moto; [B] Bicileta)");
        String tipo = scanner.next();
        Veiculo veiculo = null;
        switch (tipo) {
            case "C":
                System.out.println("Informe a placa do carro:");
                String placa = scanner.next();
                System.out.println("Informe a cor do Carro:");
                String cor = scanner.next();
                veiculo = new Carro(
                        nome,
                        placa,
                        cor);
                break;
            case "M":
                System.out.println("Informe a placa da moto:");
                String placaMoto = scanner.next();

                System.out.println("Informe a cilindrada da moto:");
                String cilindrada = scanner.next();

                veiculo = new Moto(nome, placaMoto, cilindrada);
                break;
            case "B":
                System.out.println("Informe a marca da bicicleta:");
                String marca = scanner.next();
                System.out.println("Informe a cor da bicicleta:");
                String corBicicleta = scanner.next();
                veiculo = new Bicicleta(nome, marca, corBicicleta);

                break;
        }
        veiculoRepository.add(veiculo);
        System.out.println("Carro cadastrado com sucesso!");
    }

    public void listar() {
        System.out.println("Informe o tipo de veiculo deseja visualzar:");
        System.out.println("[A] Todos; [C] Carro; [M] Moto; [B] Bicicleta");
        String tipo = scanner.next();
        List<Veiculo> veiculos = this.veiculoRepository.getAll();

        for (Veiculo veiculo : veiculos) {
            if (!"A".equals(tipo)) {
                if (veiculo.getTipo().equals(tipo)) {
                    System.out.println(veiculo);
                }
            } else {
                System.out.println(veiculo);
            }
        }
    }

    public void remover() {
        System.out.println("Informe o id do veiculo:");
        Integer id = scanner.nextInt();
        try {
            this.veiculoRepository.remove(id);
        } catch (Exception e) {
            System.out.println("veiculo não encontrado");
        }
    }
}
