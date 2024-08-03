package observer;

public class Follower implements Observer {
    private String fName;

    public Follower(String name) {
        this.fName = name;
    }

    @Override
    public void update(String newFeed, String name) {
        System.out.println(fName + " received new feed: " + newFeed + " from: " + name);
    }

    public String getName() {
        return fName;
    }
    
}
