

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        // Definindo o comportamento de aceleração como normal
        carro.setComportamento(new AceleracaoNormal());
        carro.acelerar();

        // Definindo o comportamento de aceleração como esportiva
        carro.setComportamento(new AceleracaoEsportiva());
        carro.acelerar();

        // Definindo o comportamento de aceleração como econômica
        carro.setComportamento(new AceleracaoEconomica());
        carro.acelerar();
    }
}