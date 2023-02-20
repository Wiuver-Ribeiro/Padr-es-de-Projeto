package OCP;

public class ComOCP {
    //PRINCIPIO ABERTO-FECHADO (OCP)

    public abstract class Animal {
        private String nome;
        private String especie;
        private int idade;
    
        public abstract void emitirSom();
    }
    

    public class Cachorro extends Animal {
        public void emitirSom() {
            System.out.println("Au Au!");
        }
    }
    
    public class Gato extends Animal {
        public void emitirSom() {
            System.out.println("Miau!");
        }
    }
    


}
