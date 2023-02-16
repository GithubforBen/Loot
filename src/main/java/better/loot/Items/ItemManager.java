package better.loot.Items;

import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    private List<ItemStack> items;

    public ItemManager() {
        items = new ArrayList<>();
    }

    public void createItem(ItemStack itemStack) {
        if (items.contains(itemStack)) {
            return;
        }
        items.add(itemStack);
    }

    public List<ItemStack> getItems() {
        return items;
    }
}
