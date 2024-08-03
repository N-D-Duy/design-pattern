package prototype;

import java.util.Hashtable;

public class PlayerCache {
    private static Hashtable<String, Player> playerMap = new Hashtable<String, Player>();

    public static Player getPlayer(String playerType) {
        Player cachedPlayer = playerMap.get(playerType);
        return cachedPlayer.clone();
    }

    public static void loadCache() {
        Defender defender = new Defender("John Doe", 25, "Manchester United", 50);
        playerMap.put("Defender", defender);

        Goalkeeper goalkeeper = new Goalkeeper("Jane Doe", 30, "Chelsea", 100);
        playerMap.put("Goalkeeper", goalkeeper);
    }
}
