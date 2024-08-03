package observer;

public class Main {
    public static void main(String[] args) {
        User user = new User("John");
        Follower follower1 = new Follower("Alice");
        Follower follower2 = new Follower("Bob");
        Follower follower3 = new Follower("Charlie");
        
        user.registerObserver(follower1);
        user.registerObserver(follower2);
        user.registerObserver(follower3);
        
        user.postNewFeed("Hello, world!");

        User user2 = new User("Alice");
        Follower follower4 = new Follower("John");
        user2.registerObserver(follower4);
        user2.postNewFeed("Goodbye, world!");
    }
}
