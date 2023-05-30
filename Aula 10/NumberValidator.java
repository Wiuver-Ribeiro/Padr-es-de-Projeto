public class NumberValidator implements Validator {
    @Override
    public boolean validate(String login, String senha) {
        if (senha.matches(".*\\d.*")) {
            System.out.println("Senha contém número");
            return true;
        } else {
            System.out.println("Senha não contém número");
            return false;
        }
    }
}
