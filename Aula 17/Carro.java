

public class Carro {
    private ComportamentoAceleracao comportamento;

    public void acelerar() {
        comportamento.acelerar();
    }

    public void setComportamento(ComportamentoAceleracao comportamento) {
        this.comportamento = comportamento;
    }
}
