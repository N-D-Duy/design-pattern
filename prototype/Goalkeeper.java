package prototype;

public class Goalkeeper extends Player {
    private int saves;

    public Goalkeeper(String name, int age, String team, int saves) {
        super(name, age, team);
        this.saves = saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getSaves() {
        return saves;
    }

    @Override
    public Goalkeeper clone() {
        Goalkeeper cloned = (Goalkeeper) super.clone();
        cloned.setSaves(this.saves);
        return cloned;
    }
}