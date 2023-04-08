import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = Login.getInstance();

        while (true) {
            System.out.println("\n1 - Fazer login");
            System.out.println("2 - Fazer logout");
            System.out.println("3 - Sair");
            System.out.print("\nOpção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    login.fazerLogin();
                    break;
                case 2:
                    login.fazerLogout();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! Tentativa de acesso indevido!");
            }
        }
    }
}
