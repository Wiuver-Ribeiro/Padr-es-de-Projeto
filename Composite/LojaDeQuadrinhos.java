import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LojaDeQuadrinhos {

    public static void main(String[] args) {
        // Cria um cliente com um id e um nível de assinatura aleatórios
        Random random = new Random();
        String idCliente = "CLIENTE-" + random.nextInt(10000);
        String nivelAssinatura = getNivelAssinaturaAleatorio(random);
        Cliente cliente = new Cliente(idCliente, nivelAssinatura);
        System.out.println("Cliente " + cliente.getId() + " - Nível de Assinatura: " + cliente.getNivelAssinatura());

        // Cria uma caixa de assinatura com base no nível de assinatura do cliente
        CaixaDeAssinatura caixa = new CaixaDeAssinatura(cliente.getNivelAssinatura());

        // Adiciona itens aleatórios à caixa, respeitando o limite de itens do nível de assinatura
        List<Item> itensDisponiveis = getItensDisponiveis();
        int limiteItens = caixa.getLimiteItens();
        for (int i = 0; i < limiteItens; i++) {
            Collections.shuffle(itensDisponiveis);
            Item item = itensDisponiveis.get(0);
            caixa.adicionarItem(item);
        }

        // Exibe os itens presentes na caixa e o valor total da caixa
        System.out.println("Itens na Caixa:");
        for (Item item : caixa.getItens()) {
            System.out.println(item.getClass().getSimpleName() + " - R$" + item.getPreco());
        }
        System.out.println("Valor total da caixa: R$" + caixa.getValorTotal());
    }

    private static List<Item> getItensDisponiveis() {
        List<Item> itensDisponiveis = new ArrayList<>();
        itensDisponiveis.add(new Quadrinho());
        itensDisponiveis.add(new Chaveiro());
        itensDisponiveis.add(new Busto());
        itensDisponiveis.add(new Adesivo());
        itensDisponiveis.add(new Poster());
        itensDisponiveis.add(new Camiseta());
        itensDisponiveis.add(new Caneta());
        itensDisponiveis.add(new Miniatura());
        return itensDisponiveis;
    }

    private static String getNivelAssinaturaAleatorio(Random random) {
        String[] niveisAssinatura = {"Bronze", "Prata", "Ouro", "Platina"};
        return niveisAssinatura[random.nextInt(niveisAssinatura.length)];
    }

}
