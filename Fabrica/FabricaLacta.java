public class FabricaLacta extends FabricaProdutos {
    @Override
    public Produto criarProduto(int codigo) {
        switch (codigo) {
            case 1:
                return new OvoAoLeite();
            case 2:
                return new OvoOreo();
            case 3:
                return new OvoSonhoDeValsa();
            default:
                return null;
        }
    }
}
