package dev.tdmnhat.plugin.spigot.listener;

import dev.tdmnhat.plugin.spigot.FarmAdvanced;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class InteractMachineListener implements Listener {

    private FarmAdvanced plugin;
    public InteractMachineListener(FarmAdvanced plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        Material material = event.getBlock().getType();
        if(material.equals(Material.TORCH)) {
            // Open machine inventory to see options and do an upgrade

        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Material material = event.getBlock().getType();
        if(material.equals(Material.TORCH) && player.isSneaking()) {
            // Open the machine inventory to see options and do an upgrade


            event.setCancelled(true);
        } else {
            // Drop that torch and assign that item with some metas

        }
    }
}
