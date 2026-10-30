package dev.tdmnhat.plugin.spigot.listener;

import dev.tdmnhat.plugin.spigot.FarmAdvanced;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlaceBreakMachineListener implements Listener {

    private FarmAdvanced plugin;
    public PlaceBreakMachineListener(FarmAdvanced plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Block placed = event.getBlock();
        Material material = event.getBlock().getType();
        if(material.equals(Material.TORCH)) {
            Block machine = placed.getRelative(BlockFace.DOWN);
            int radius = 3;

            for(int dx = -radius; dx <= radius; ++dx) {
                for(int dz = -radius; dz <= radius; ++dz) {
                    if(dx == 0 && dz == 0) continue;

                    Block ground = machine.getRelative(dx, 0, dz);
                    if(ground.getType().equals(Material.valueOf("GRASS")) || ground.getType().equals(Material.DIRT)) {
                        ground.setType(Material.valueOf("SOIL"));
                    }
                }
            }
        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {

    }
}
