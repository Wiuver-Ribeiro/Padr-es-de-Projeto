public class FabricaGaroto extends FabricaProdutos {
    @Override
    public Produto criarProduto(int codigo) {
        switch (codigo) {
            case 1:
                return new OvoCrocante();
            case 2:
                return new OvoTalento();
            case 3:
                return new OvoBatonAoLeite();
            default:
                return null;
        }
    }
}
