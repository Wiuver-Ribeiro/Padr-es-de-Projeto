import java.util.ArrayList;
import java.util.List;

public class CaixaDeAssinatura {

    private String nivelAssinatura;
    private int limiteItens;
    private List<Item> itens;

    public CaixaDeAssinatura(String nivelAssinatura) {
        this.nivelAssinatura = nivelAssinatura;
        setLimiteItens();
        this.itens = new ArrayList<>();
    }

    public String getNivelAssinatura() {
        return nivelAssinatura;
    }

    public int getLimiteItens() {
        return limiteItens;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        if (itens.size() < limiteItens) {
            itens.add(item);
        }
    }

    public double getValorTotal() {
        double valorTotal = 0.0;
        for (Item item : itens) {
            valorTotal += item.getPreco();
        }
        return valorTotal;
    }

    private void setLimiteItens() {
        switch (nivelAssinatura) {
            case "Bronze":
                limiteItens = 3;
                break;
            case "Prata":
                limiteItens = 5;
                break;
            case "Ouro":
                limiteItens = 7;
                break;
            case "Platina":
                limiteItens = 10;
                break;
            default:
                limiteItens = 0;
                break;
        }
    }

}
