public class LoginExistenceValidator extends Validator {
    private static final String[] REGISTERED_LOGINS = {"wiuver.ribeiro", "lara.kamilly", "vlastemuller.paiva"};

    public boolean validate(Login login) {
        for (String registeredLogin : REGISTERED_LOGINS) {
            if (registeredLogin.equals(login.getLogin())) {
                return successor == null || successor.validate(login);
            }
        }
        return false;
    }
}
