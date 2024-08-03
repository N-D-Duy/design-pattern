package prototype;

public class Defender extends Player {
    private int tackles;

    public Defender(String name, int age, String team, int tackles) {
        super(name, age, team);
        this.tackles = tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public int getTackles() {
        return tackles;
    }

    @Override
    public Defender clone() {
        Defender cloned = (Defender) super.clone();
        cloned.setTackles(this.tackles);
        return cloned;
    }
    
}
