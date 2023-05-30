import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoDeStream servicoDeStream = new ServicoDeStream();

        servicoDeStream.mostrarOpcoes();

        List<Integer> opcoesSelecionadas = new ArrayList<>();

        System.out.println("Selecione a assinatura base (1 para Assinatura Base):");
        int assinaturaBase = scanner.nextInt();
        opcoesSelecionadas.add(assinaturaBase);

        System.out.println("Deseja adicionar algum pacote opcional? Digite 0 para não adicionar, ou o número do pacote):");
            int pacoteOpcional = scanner.nextInt();

        while (pacoteOpcional != 0) {
            opcoesSelecionadas.add(pacoteOpcional);
    
            System.out.println("Deseja adicionar mais algum pacote opcional? (Digite 0 para parar ou o número do próximo pacote):");
            pacoteOpcional = scanner.nextInt();
        }
    
        double precoTotal = servicoDeStream.calcularPreco(opcoesSelecionadas);
    
        System.out.println("Assinatura selecionada:");
        System.out.println(servicoDeStream.getAssinaturaBase().getTipo());
    
        for (int i = 1; i < opcoesSelecionadas.size(); i++) {
            int opcao = opcoesSelecionadas.get(i);
            System.out.println(servicoDeStream.getPacotesOpcionais().get(opcao - 2).getTipo());
        }
    
        System.out.println("Preço total: R$" + precoTotal);
    }
    
}