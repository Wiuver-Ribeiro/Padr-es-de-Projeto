import java.util.List;

public class Main {
    public static void main(String[] args) {
        LojaDeQuadrinhos loja = new LojaDeQuadrinhos();

        Cliente cliente1 = new Cliente("Lara", "Bronze");
        List<Item> caixaCliente1 = loja.criarCaixaAssinatura(cliente1);
        double valorTotalCliente1 = loja.calcularValorTotal(caixaCliente1);

        System.out.println("Itens da caixa do cliente " + cliente1.getCategoria() + ":");
        for (Item item : caixaCliente1) {
            System.out.println(item.getNome());
        }
        System.out.println("Valor total da caixa: R$" + valorTotalCliente1);

        System.out.println();

        Cliente cliente2 = new Cliente("Wiuver", "Platina");
        List<Item> caixaCliente2 = loja.criarCaixaAssinatura(cliente2);
        double valorTotalCliente2 = loja.calcularValorTotal(caixaCliente2);

        System.out.println("Itens da caixa do cliente " + cliente2.getCategoria() + ":");
        for (Item item : caixaCliente2) {
            System.out.println(item.getNome());
        }
        System.out.println("Valor total da caixa: R$" + valorTotalCliente2);
    }
}
