import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto (1-9): ");
        int codigo = scanner.nextInt();

        FabricaProdutos fabrica;
        Produto produto;

        if (codigo <= 3) {
            fabrica = new FabricaNestle();
        } else if (codigo <= 6) {
            fabrica = new FabricaGaroto();
        } else if (codigo <= 9) {
            fabrica = new FabricaLacta();
        } else {
            System.out.println("Código inválido!");
            return;
        }

        produto = fabrica.criarProduto(codigo % 3 == 0 ? 3 : codigo % 3);

        if (produto != null) {
            produto.exibirDetalhes();
        } else {
            System.out.println("Código inválido!");
        }
    }
}
