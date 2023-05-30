public class LengthValidator implements Validator {
    @Override
    public boolean validate(String login, String senha) {
        int minLength = 8;
        int maxLength = 16;
        int senhaLength = senha.length();

        if (senhaLength >= minLength && senhaLength <= maxLength) {
            System.out.println("Tamanho da senha válido");
            return true;
        } else {
            System.out.println("Tamanhoda senha inválido");
            return false;
        }
    }
}
