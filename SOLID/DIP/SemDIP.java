package DIP;

public class SemDIP {
    //PRINCIPIO DA INVERSÃO DE DEPENDENCIAS (DIP)

    public class Pedido {
        private Pagamento pagamento;
    
        public Pedido() {
            this.pagamento = new Pagamento();
        }
    
        public void realizarPagamento() {
            pagamento.efetuarPagamento();
        }
    }
    
    public class Pagamento {
        public void efetuarPagamento() {
            System.out.println("Realizando pagamento...");
        }
    }
    
}
