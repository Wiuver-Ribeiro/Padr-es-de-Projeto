public class Main {
    public static void main(String[] args) {
        Validator validatorChain = new LoginValidator();
        validatorChain = linkWith(validatorChain, new UppercaseValidator());
        validatorChain = linkWith(validatorChain, new LowercaseValidator());
        validatorChain = linkWith(validatorChain, new SpecialCharacterValidator());
        validatorChain = linkWith(validatorChain, new NumberValidator());
        validatorChain = linkWith(validatorChain, new ConsecutiveNumbersValidator());
        validatorChain = linkWith(validatorChain, new LengthValidator());

        String login = "usuario1";
        String senha = "Abc123@";

        boolean isValid = validatorChain.validate(login, senha);
        if (isValid) {
            System.out.println("Conjunto de login e senha válido");
        } else {
            System.out.println("Conjunto de login e senha inválido");
        }
    }

    private static Validator linkWith(Validator validator, Validator nextValidator) {
        return new Validator() {
            @Override
            public boolean validate(String login, String senha) {
                boolean isValid = validator.validate(login, senha);
                return isValid && nextValidator.validate(login, senha);
            }
        };
    }
}
