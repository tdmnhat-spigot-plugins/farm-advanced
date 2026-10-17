package dev.tdmnhat.plugin.spigot;

import dev.tdmnhat.plugin.spigot.command.FarmAdvancedCommand;
import dev.tdmnhat.plugin.spigot.file.FarmConfigFile;
import dev.tdmnhat.plugin.spigot.listener.InteractMachineListener;
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

        // farm-config.yml
        FarmConfigFile.setup();
        FarmConfigFile.getConfiguration().options().copyDefaults(true);
        FarmConfigFile.save();
    }

    private void registerListeners() {
        this.getServer().getPluginManager().registerEvents(new InteractMachineListener(this), this);
    }

    private void registerCommands() {
        this.getCommand("farmadvanced").setExecutor(new FarmAdvancedCommand(this));
    }
}
