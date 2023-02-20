package ISP;

public class ComISP {
    //PRINCIPIO DA SEGREGACAÇÃO DE INTERFACES (ISP)

    public interface Trabalhador {
        void trabalhar();
    }
    
    public interface Comedor {
        void comer();
    }
    
    public interface Dorminhoco {
        void dormir();
    }
    
    public class Operario implements Trabalhador {
        @Override
        public void trabalhar() {
            System.out.println("Operário trabalhando");
        }


    }
    
}
