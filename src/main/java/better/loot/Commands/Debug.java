package better.loot.Commands;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class Debug implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof  Player)) {
            sender.sendMessage("You are not a player.");
            return false;
        }

        Player player = (Player) sender;

        if (!player.getUniqueId().toString().equals("3c54dc3e-9651-47e4-9b1b-2c8d71168762")) {
            player.sendMessage("This command can only be used by super_1337.\n+" +
                    "It is only used for debuting.");
            return false;
        }

        if (Bukkit.getWorld("pvp") == null) {
            WorldCreator worldCreator = new WorldCreator("pvp");
            Bukkit.createWorld(worldCreator);
        }

        if (!player.getWorld().getName().equals("pvp")) {
            player.teleport(Bukkit.getWorld("pvp").getSpawnLocation());
        }

        player.sendMessage("You are now in the world \"pvp\".");
        return true;
    }
}
