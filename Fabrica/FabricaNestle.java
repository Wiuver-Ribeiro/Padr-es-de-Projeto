public class FabricaNestle extends FabricaProdutos {
    @Override
    public Produto criarProduto(int codigo) {
        switch (codigo) {
            case 1:
                return new OvoAlpino();
            case 2:
                return new OvoClassic();
            case 3:
                return new OvoKitKat();
            default:
                return null;
        }
    }
}
