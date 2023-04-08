import java.util.Scanner;

public class Login {
    private static Login instance = null;
    private static String loggedInUser = null;
    private static final String codigoBot = gerarCodigoBot();
    
    private Login() {}
    
    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }
    
    public static boolean estaLogado() {
        return loggedInUser != null;
    }
    
    public static void fazerLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome de usuário: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("Digite o código para provar que você não é um bot: ");
        String codigo = scanner.nextLine();
        if (codigo.equals(codigoBot)) {
            System.out.println("Acesso negado: bot detectado.");
        } else {
            loggedInUser = nomeUsuario;
            System.out.println("Bem-vindo, " + loggedInUser + "!");
        }
    }
    






    
    public static void fazerLogout() {
        loggedInUser = null;
        System.out.println("Logout realizado com sucesso.");
    }
    
    private static String gerarCodigoBot() {
        String codigoBot = "";
        for (int i = 0; i < 4; i++) {
            int rand = (int) (Math.random() * 10);
            codigoBot += Integer.toString(rand);
        }
        for (int i = 0; i < 2; i++) {
            int rand = (int) (Math.random() * 23) + 97;
            char c = (char) rand;
            codigoBot += Character.toString(c);
        }
        return codigoBot;
    }

 
}
