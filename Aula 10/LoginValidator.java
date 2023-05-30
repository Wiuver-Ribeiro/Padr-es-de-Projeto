import java.util.ArrayList;
import java.util.List;

public class LoginValidator implements Validator {
    private final List<String> usuariosCadastrados;

    public LoginValidator() {
        usuariosCadastrados = new ArrayList<>();
        usuariosCadastrados.add("usuario1");
        usuariosCadastrados.add("usuario2");
        usuariosCadastrados.add("usuario3");
    }

    @Override
    public boolean validate(String login, String senha) {
        if (usuariosCadastrados.contains(login)) {
            System.out.println("Login válido");
            return true;
        } else {
            System.out.println("Login inválido");
            return false;
        }
    }
}
