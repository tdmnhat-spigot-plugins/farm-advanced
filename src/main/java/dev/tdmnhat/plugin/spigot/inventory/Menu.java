package dev.tdmnhat.plugin.spigot.inventory;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public abstract class Menu {

    protected Inventory inventory;
    protected PlayerMenuUtility playerMenuUtility;

    public Menu(PlayerMenuUtility playerMenuUtility) {
        this.playerMenuUtility = playerMenuUtility;
    }

    public abstract String getMenuName();
    public abstract int getSlots();
    public abstract void handleMenu(InventoryClickEvent event);
    public abstract void setMenuItems();

    public void open() {
        inventory = Bukkit.createInventory(null, getSlots(), getMenuName());

        setMenuItems();

        playerMenuUtility.getPlayer().openInventory(inventory);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public ItemStack makeItem(Material material, int amount, String displayName, List<String> lore) {
        ItemStack itemStack = new ItemStack(material, amount);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    public ItemStack makeItem(Material material, int amount, String displayName, String... lore) {
        return makeItem(material, amount, displayName, Arrays.asList(lore));
    }
}
