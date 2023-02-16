package better.loot.Listener;

import better.loot.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class ListenerManager {

    public ListenerManager() {
        createListener(new DeathListener());
    }

    public void createListener(Listener listener) {
        Bukkit.getPluginManager().registerEvents(listener, Main.getInstance());
    }
}
