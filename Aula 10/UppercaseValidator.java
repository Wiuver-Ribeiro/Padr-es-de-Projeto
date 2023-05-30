public class UppercaseValidator implements Validator {
    @Override
    public boolean validate(String login, String senha) {
        if (senha.matches(".*[A-Z].*")) {
            System.out.println("Senha contém caractere em maiúsculo");
            return true;
        } else {
            System.out.println("Senha não contém caractere em maiúsculo");
            return false;
        }
    }
}
