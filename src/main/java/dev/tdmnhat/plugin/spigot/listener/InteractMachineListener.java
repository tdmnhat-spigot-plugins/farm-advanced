package dev.tdmnhat.plugin.spigot.listener;

import dev.tdmnhat.plugin.spigot.FarmAdvanced;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractMachineListener implements Listener {

    private FarmAdvanced plugin;

    public InteractMachineListener() {
        plugin = (FarmAdvanced) Bukkit.getPluginManager().getPlugin("FarmAdvanced");
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Block block = event.getClickedBlock();
        if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK) && block.getType().equals(Material.TORCH)) {
            // Open machine upgrade menu

        }
    }
}
