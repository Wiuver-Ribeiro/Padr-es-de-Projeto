public class SpecialCharacterValidator implements Validator {
    @Override
    public boolean validate(String login, String senha) {
        if (senha.matches(".*[@#$%&*].*")) {
            System.out.println("Senha contém caractere especial");
            return true;
        } else {
            System.out.println("Senha não contém caractere especial");
            return false;
        }
    }
}
