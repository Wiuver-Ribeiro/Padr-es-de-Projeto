package Aula 14;

public class Main {
    public static void main(String[] args) {
        // Criação dos objetos do sistema
        Cliente cliente1 = new Cliente("João");
        Produto produto1 = new Produto("Camiseta", 29.99);

        // Criação do serviço de venda
        VendaService vendaService = new VendaService();

        // Criação do cliente observer
        ClienteObserver clienteObserver1 = new ClienteObserver("Maria");

        // Adiciona o cliente observer ao serviço de venda
        vendaService.addObserver(clienteObserver1);

        // Registro da venda
        vendaService.registrarVenda(cliente1, produto1);
    }
}
