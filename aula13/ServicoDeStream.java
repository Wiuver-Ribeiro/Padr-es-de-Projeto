import java.util.ArrayList;
import java.util.List;

public class ServicoDeStream {
    private Assinatura assinaturaBase;
    private List<Assinatura> pacotesOpcionais;

    public ServicoDeStream() {
        assinaturaBase = new Assinatura("Assinatura Base - Assistir vídeos num único dispositivo", 9.99);
        pacotesOpcionais = new ArrayList<>();
        pacotesOpcionais.add(new Assinatura("Pacote 1 - Assistir vídeos em vários dispositivos", 19.99));
        pacotesOpcionais.add(new Assinatura("Pacote 2 - Frete Grátis em produtos", 9.99));
        pacotesOpcionais.add(new Assinatura("Pacote 3 - Caixa surpresa com produtos relacionados a filmes e séries", 29.99));
        pacotesOpcionais.add(new Assinatura("Pacote 4 - Cartão de crédito Platinum", 49.99));
        pacotesOpcionais.add(new Assinatura("Pacote 5 - Compra com Cash Back", 19.99));
    }

    public Assinatura getAssinaturaBase() {
        return assinaturaBase;
    }

    public List<Assinatura> getPacotesOpcionais() {
        return pacotesOpcionais;
    }

    public void mostrarOpcoes() {
        System.out.println("Opções de Assinatura:");

        System.out.println("1. " + assinaturaBase.getTipo() + " - R$" + assinaturaBase.getPreco());

        for (int i = 0; i < pacotesOpcionais.size(); i++) {
            System.out.println((i + 2) + ". " + pacotesOpcionais.get(i).getTipo() + " - R$" + pacotesOpcionais.get(i).getPreco());
        }
    }

    public double calcularPreco(List<Integer> opcoesSelecionadas) {
        double precoTotal = assinaturaBase.getPreco();

        for (int opcao : opcoesSelecionadas) {
            if (opcao >= 2 && opcao <= pacotesOpcionais.size() + 1) {
                precoTotal += pacotesOpcionais.get(opcao - 2).getPreco();
            }
        }

        return precoTotal;
    }
}
