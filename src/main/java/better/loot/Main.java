package better.loot;

import better.loot.Commands.Debug;
import better.loot.Items.CreateItems;
import better.loot.Items.ItemManager;
import better.loot.Listener.DeathListener;
import better.loot.Listener.ListenerManager;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;
    private ItemManager itemManager;

    @Override
    public void onLoad() {
        instance = this;

        itemManager = new ItemManager();
    }

    @Override
    public void onEnable() {
        new ListenerManager();
        new CreateItems();
        getCommand("dbl").setExecutor(new Debug());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getInstance() {
        return instance;
    }

    public void register(String cmd, CommandExecutor commandExecutor) {
        getCommand(cmd).setExecutor(commandExecutor);
    }

    public ItemManager getItemManager() {
        return itemManager;
    }
}
