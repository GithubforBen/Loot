package better.loot.Listener;

import better.loot.Main;
import net.kyori.adventure.text.ComponentBuilder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Random;

public class DeathListener implements Listener {

    @EventHandler
    public void death(PlayerRespawnEvent event) {
        if (event.getPlayer().getWorld().getName().equals("pvp")) {
            Player player = event.getPlayer();
            player.getInventory().clear();
            player.getInventory().addItem(getRandomItem());
        }
    }

    private ItemStack getRandomItem() {
        List<ItemStack> items = Main.getInstance().getItemManager().getItems();

        Random random = new Random();
        return items.get(random.nextInt(items.size()));
    }
}
