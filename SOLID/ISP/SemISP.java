package ISP;

public class SemISP {
    //PRINCIPIO DA SEGREGACAÇÃO DE INTERFACES (ISP)

    public interface Trabalhador {
        void trabalhar();
        void comer();
        void dormir();
    }
    
    public class Operario implements Trabalhador {
        @Override
        public void trabalhar() {
            System.out.println("Operário trabalhando");
        }
        
        @Override
        public void comer() {
            System.out.println("Operário comendo");
        }
        
        @Override
        public void dormir() {
            System.out.println("Operário dormindo");
        }
    }
    
}
