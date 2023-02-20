package LSP;

public class ComLSP {
    //PRINCIPIO DA SUBSTITUIÇÃO DE LISKOV (LSP)

    public interface Figura {
        int area();
    }
    
    public class Retangulo implements Figura {
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
        
        @Override
        public int area() {
            return altura * largura;
        }
    }
    
    public class Quadrado implements Figura {
        private int lado;
        
        public void setLado(int lado) {
            this.lado = lado;
        }
        
        public int getLado() {
            return lado;
        }
        
        @Override
        public int area() {
            return lado * lado;
        }
    }
    
}
