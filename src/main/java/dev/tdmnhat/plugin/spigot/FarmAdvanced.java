package dev.tdmnhat.plugin.spigot;

import dev.tdmnhat.plugin.spigot.listener.FarmlandListener;
import dev.tdmnhat.plugin.spigot.listener.PlaceBreakMachineListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FarmAdvanced extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerConfig();
        registerListeners();
        registerCommands();
    }

    private void registerConfig() {
        // config.yml
        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
    }

    private void registerListeners() {
        this.getServer().getPluginManager().registerEvents(new FarmlandListener(), this);
        this.getServer().getPluginManager().registerEvents(new PlaceBreakMachineListener(this), this);
    }

    private void registerCommands() {

    }
}
