public class ConsecutiveNumbersValidator implements Validator {
    @Override
    public boolean validate(String login, String senha) {
        if (!senha.matches(".*\\d{3,}.*")) {
            System.out.println("Senha não contém 3 números consecutivos");
            return true;
        } else {
            System.out.println("Senha contém 3 números consecutivos");
            return false;
        }
    }
}
