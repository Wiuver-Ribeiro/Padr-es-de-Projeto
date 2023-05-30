public class PasswordValidator extends Validator {
    public boolean validate(Login login) {
        String password = login.getPassword();
        if (password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*[!@#$%&*].*")
                && password.matches(".*\\d.*")
                && !password.matches(".*\\d{3}.*")
                && password.length() >= 8
                && password.length() <= 16) {
            return successor == null || successor.validate(login);
        }
        return false;
    }
}
