package Aula 14;

public class ClienteObserver implements Observer {
    private String nome;

    public ClienteObserver(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Cliente cliente, Produto produto) {
        System.out.println("Notificação para o cliente " + nome + ": Venda registrada - Produto: " + produto.getNome());
    }
}
