package better.loot.Items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemAPI {
    private ItemMeta itemMeta;
    private ItemStack itemStack;

    public ItemAPI(Material material) {
        itemStack = null;
        itemMeta = null;
        itemStack = new ItemStack(material);
        itemMeta = itemStack.getItemMeta();

    }

    public ItemAPI(Material material, List<EnchantmentAPI> enchantments) {
        itemStack = null;
        itemMeta = null;
        itemStack = new ItemStack(material);
        itemMeta = itemStack.getItemMeta();
        enchantments.forEach(enchantment -> {
            itemMeta.addEnchant(enchantment.getEnchantment(), enchantment.level(), true);
        });
    }

    public ItemAPI(Material material, String name,List<EnchantmentAPI> enchantments) {
        itemStack = null;
        itemMeta = null;
        itemStack = new ItemStack(material);
        itemMeta = itemStack.getItemMeta();
        enchantments.forEach(enchantment -> {
            itemMeta.addEnchant(enchantment.getEnchantment(), enchantment.level(), true);
        });
        itemMeta.setDisplayName(name);
    }

    public ItemAPI(Material material, String name,List<EnchantmentAPI> enchantments, List<String> strings) {
        itemStack = null;
        itemMeta = null;
        itemStack = new ItemStack(material);
        itemMeta = itemStack.getItemMeta();
        enchantments.forEach(enchantment -> {
            itemMeta.addEnchant(enchantment.getEnchantment(), enchantment.level(), true);
        });
        itemMeta.setDisplayName(name);
        itemMeta.setLore(strings);
    }

    public ItemStack build() {
        itemMeta.setUnbreakable(true);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
