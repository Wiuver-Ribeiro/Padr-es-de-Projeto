public abstract class Produto {
    protected String nome;
    protected String marca;
    protected double peso;
    protected double preco;
    protected String descricao;

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Peso: " + peso + "g");
        System.out.println("Preço: R$" + preco);
        System.out.println("Descrição: " + descricao);
    }
}
