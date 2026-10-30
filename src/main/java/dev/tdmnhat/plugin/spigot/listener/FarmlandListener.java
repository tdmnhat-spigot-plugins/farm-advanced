package dev.tdmnhat.plugin.spigot.listener;

import dev.tdmnhat.plugin.spigot.FarmAdvanced;
import dev.tdmnhat.plugin.spigot.util.ServerVersion;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;

public class FarmlandListener implements Listener {

    private FarmAdvanced plugin;

    public FarmlandListener() {
        plugin = (FarmAdvanced) Bukkit.getPluginManager().getPlugin("FarmAdvanced");
    }

    @EventHandler
    public void onBlockFade(BlockFadeEvent event) {
        if(ServerVersion.getMajor() >= 26 || (ServerVersion.getMajor() == 1 && ServerVersion.getMinor() >= 13)) {
            event.setCancelled(event.getBlock().getType().equals(Material.valueOf("FARMLAND")));
        } else {
           event.setCancelled(event.getBlock().getType().equals(Material.valueOf("SOIL")));
        }
    }
}
