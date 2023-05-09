public class PaymentSystemFacade {

    private final PaymentSystem sistemaPagamento;

    public PaymentSystemFacade() {
        sistemaPagamento = new PaymentSystem();
    }

    public void efetuarPagamento() {
        sistemaPagamento.processarPagamento();
    }
}
