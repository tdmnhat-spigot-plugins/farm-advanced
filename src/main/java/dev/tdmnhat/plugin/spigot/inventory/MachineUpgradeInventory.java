package dev.tdmnhat.plugin.spigot.inventory;

import dev.tdmnhat.plugin.spigot.FarmAdvanced;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MachineUpgradeInventory extends Menu {

    private FarmAdvanced plugin;

    public MachineUpgradeInventory(PlayerMenuUtility playerMenuUtility) {
        super(playerMenuUtility);
        plugin = (FarmAdvanced) Bukkit.getPluginManager().getPlugin("FarmAdvanced");
    }

    @Override
    public String getMenuName() {
        return "Machine Upgrade Menu";
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public void handleMenu(InventoryClickEvent event) {

    }

    @Override
    public void setMenuItems() {

    }
}
