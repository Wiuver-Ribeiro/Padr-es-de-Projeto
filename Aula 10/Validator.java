public abstract class Validator {
    protected Validator successor;

    public void setSuccessor(Validator successor) {
        this.successor = successor;
    }

    public abstract boolean validate(Login login);
}
