import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LojaDeQuadrinhos {
    private List<Item> itensDisponiveis;

    public LojaDeQuadrinhos() {
        itensDisponiveis = new ArrayList<>();
        itensDisponiveis.add(new Item("Quadrinhos", 15.00));
        itensDisponiveis.add(new Item("Chaveiros", 5.00));
        itensDisponiveis.add(new Item("Bustos", 10.00));
        itensDisponiveis.add(new Item("Adesivos", 1.00));
        itensDisponiveis.add(new Item("Posters", 25.00));
        itensDisponiveis.add(new Item("Camisetas", 25.00));
        itensDisponiveis.add(new Item("Canetas", 3.00));
        itensDisponiveis.add(new Item("Miniaturas", 20.00));
    }

    public List<Item> criarCaixaAssinatura(Cliente cliente) {
        List<Item> itensCaixa = new ArrayList<>();

        int limiteItens = 0;
        switch (cliente.getCategoria()) {
            case "Bronze":
                limiteItens = 3;
                break;
            case "Prata":
                limiteItens = 5;
                break;
            case "Ouro":
                limiteItens = 7;
                break;
            case "Platina":
                limiteItens = 10;
                break;
            default:
                System.out.println("Categoria de cliente inválida.");
                return itensCaixa;
        }

        Random random = new Random();
        int numItens = random.nextInt(limiteItens) + 1; // Gera um número aleatório entre 1 e o limite de itens

        for (int i = 0; i < numItens; i++) {
            int indiceItem = random.nextInt(itensDisponiveis.size()); // Gera um índice aleatório para escolher um item
            Item item = itensDisponiveis.get(indiceItem);
            itensCaixa.add(item);
        }

        return itensCaixa;
    }

    public double calcularValorTotal(List<Item> itensCaixa) {
        double valorTotal = 0;
        for (Item item : itensCaixa) {
            valorTotal += item.getValor();
        }
        return valorTotal;
    }
}
