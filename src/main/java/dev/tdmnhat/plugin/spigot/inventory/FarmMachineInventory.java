package dev.tdmnhat.plugin.spigot.inventory;

import dev.tdmnhat.plugin.spigot.FarmAdvanced;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class FarmMachineInventory {

    private Inventory inventory;
    private FarmAdvanced plugin;

    public FarmMachineInventory(FarmAdvanced plugin) {
        this.plugin = plugin;
        this.inventory = Bukkit.createInventory(null, 27, "Farm Machine Upgrade");
        setupInventory();
    }

    private void setupInventory() {

    }

    public Inventory getInventory() { return inventory; }
}
