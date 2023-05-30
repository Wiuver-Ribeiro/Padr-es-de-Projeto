public class LowercaseValidator implements Validator {
    @Override
    public boolean validate(String login, String senha) {
        if (senha.matches(".*[a-z].*")) {
            System.out.println("Senha contém caractere em minúsculo");
            return true;
        } else {
            System.out.println("Senha não contém caractere em minúsculo");
            return false;
        }
    }
}
