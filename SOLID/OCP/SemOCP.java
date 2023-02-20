package OCP;

public class SemOCP {
    //PRINCIPIO ABERTO-FECHADO (OCP)

    public class Animal {
        private String nome;
        private String especie;
        private int idade;
    
        public void emitirSom() {
            if (especie.equals("cachorro")) {
                System.out.println("Au Au!");
            } else if (especie.equals("gato")) {
                System.out.println("Miau!");
            }
            // mais opções para outras espécies
        }
    }
    
}
