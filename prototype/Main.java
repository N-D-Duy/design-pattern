package prototype;

public class Main {
    public static void main(String[] args) {
        PlayerCache.loadCache();

        System.out.println("Cloning Defender....");
        Player defender = PlayerCache.getPlayer("Defender");
        System.out.println("Created Defender: ");

        if (defender instanceof Defender) {
            Defender clonedDefender = (Defender) defender;
            clonedDefender.setTackles(60);
            System.out.println("Tackles: " + clonedDefender.getTackles());
        }
        System.out.println("Player Type: " + defender.getClass().getSimpleName());
        System.out.println("Name: " + defender.getName());
        System.out.println("Age: " + defender.getAge());
        System.out.println("Team: " + defender.getTeam());

        System.out.println();

        System.out.println("Cloning Goalkeeper....");
        Player goalkeeper = PlayerCache.getPlayer("Goalkeeper");
        System.out.println("Created Goalkeeper: ");
        System.out.println("Player Type: " + goalkeeper.getClass().getSimpleName());
        System.out.println("Name: " + goalkeeper.getName());
        System.out.println("Age: " + goalkeeper.getAge());
        System.out.println("Team: " + goalkeeper.getTeam());

    }

}
