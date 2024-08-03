package observer;
import java.util.List;
import java.util.ArrayList;
public class User implements Subject {
    private String name;
    private List<Observer> followers;
    private String newFeed;

    public User(String name) {
        this.name = name;
        this.followers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : followers) {
            observer.update(newFeed, name);
        }
    }

    public void postNewFeed(String newFeed) {
        this.newFeed = newFeed;
        notifyObservers();
    }
}
