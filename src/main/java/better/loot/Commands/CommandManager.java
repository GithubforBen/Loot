package better.loot.Commands;

import better.loot.Main;
import org.bukkit.Bukkit;

public class CommandManager {

    public CommandManager() {
        Main.getInstance().register("debugLoot", new Debug());
    }
}
