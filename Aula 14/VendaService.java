package Aula 14;

import java.util.ArrayList;
import java.util.List;

public class VendaService implements IAppService {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Cliente cliente, Produto produto) {
        for (Observer observer : observers) {
            observer.update(cliente, produto);
        }
    }

    @Override
    public void registrarVenda(Cliente cliente, Produto produto) {
        // Lógica para registrar a venda
        System.out.println("Venda registrada para o cliente " + cliente.getNome() + " - Produto: " + produto.getNome());
        notifyObservers(cliente, produto);
    }
}
