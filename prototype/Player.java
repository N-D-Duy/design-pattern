package prototype;

public class Player implements Cloneable {
    private String name;
    private int age;
    private String team;

    public Player(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public Player clone() {
        try {
            return (Player) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}