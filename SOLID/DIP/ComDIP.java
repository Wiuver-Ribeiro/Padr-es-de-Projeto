package DIP;

public class ComDIP {
    //PRINCIPIO DA INVERSÃO DE DEPENDENCIAS (DIP)

    public interface Pagamento {
        void efetuarPagamento();
    }
    
    public class Pedido {
        private Pagamento pagamento;
    
        public Pedido(Pagamento pagamento) {
            this.pagamento = pagamento;
        }
    
        public void realizarPagamento() {
            pagamento.efetuarPagamento();
        }
    }
    
    public class PagamentoOnline implements Pagamento {
        @Override
        public void efetuarPagamento() {
            System.out.println("Realizando pagamento online...");
        }
    }
    
    public class PagamentoBoleto implements Pagamento {
        @Override
        public void efetuarPagamento() {
            System.out.println("Realizando pagamento via boleto...");
        }
    }
    
}
