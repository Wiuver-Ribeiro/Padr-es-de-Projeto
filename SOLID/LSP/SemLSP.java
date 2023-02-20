package LSP;

public class SemLSP {
    //PRINCIPIO DA SUBSTITUIÇÃO DE LISKOV (LSP)

    
    public class Retangulo {
        private int altura;
        private int largura;
        
        public void setAltura(int altura) {
            this.altura = altura;
        }
        
        public void setLargura(int largura) {
            this.largura = largura;
        }
        
        public int getAltura() {
            return altura;
        }
        
        public int getLargura() {
            return largura;
        }
        
        public int area() {
            return altura * largura;
        }
    }
    
    public class Quadrado extends Retangulo {
        @Override
        public void setAltura(int altura) {
            super.setAltura(altura);
            super.setLargura(altura);
        }
        
        @Override
        public void setLargura(int largura) {
            super.setLargura(largura);
            super.setAltura(largura);
        }
    }
    
}
