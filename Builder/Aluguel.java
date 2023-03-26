import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    private final List<Jogo> jogos = new ArrayList<>();
    
    public void addJogo(Jogo jogo) {
        jogos.add(jogo);
    }
    
    public void removeJogo(Jogo jogo) {
        jogos.remove(jogo);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Jogo jogo : jogos) {
            total += jogo.getPreco();
        }
        return total;
    }
    
    public void imprimirJogos() {
        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }
    }
}
