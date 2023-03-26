public class Main {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo.Builder()
                            .setNome("Super Mario Bros.")
                            .setPlataforma("Nintendo Switch")
                            .setGenero("Plataforma")
                            .setPreco(59.99)
                            .build();
                            
        Jogo jogo2 = new Jogo.Builder()
                            .setNome("The Last of Us Part II")
                            .setPlataforma("Sony")
                            .setGenero("Aventura")
                            .setPreco(79.99)
                            .build();
                            
        Aluguel aluguel = new Aluguel();
        aluguel.addJogo(jogo1);
        aluguel.addJogo(jogo2);
        aluguel.imprimirJogos();
        
        System.out.println("Total: " + aluguel.calcularTotal());
    }
}
