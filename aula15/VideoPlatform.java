import java.util.ArrayList;
import java.util.List;

public class VideoPlatform implements Subject {
    private List<Observer> observers;
    private List<String> newContent;

    public VideoPlatform() {
        this.observers = new ArrayList<>();
        this.newContent = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addNewContent(String content) {
        newContent.add(content);
        notifyObservers(content);
    }
}
