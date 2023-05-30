public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Login login1 = new Login("wiuver.ribeiro", "Abc123#");
        Login login2 = new Login("lara.kamilly", "12345678");
        Login login3 = new Login("vlastemuller.paiva", "abCdEfGh");

        Validator validator = new LoginExistenceValidator();
        validator.setSuccessor(new PasswordValidator());

        System.out.println("Usuário 01 possui login válido: " + validator.validate(login1));
        System.out.println("Usuário 02 possui login válido: " + validator.validate(login2));
        System.out.println("Usuário 03 possui login válido: " + validator.validate(login3));
    }
}
