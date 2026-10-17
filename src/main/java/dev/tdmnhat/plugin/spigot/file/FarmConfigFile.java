package dev.tdmnhat.plugin.spigot.file;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;

public class FarmConfigFile {

    private static File file;
    private static FileConfiguration configuration;

    public static void setup() {
        try {
            Plugin plugin = Bukkit.getPluginManager().getPlugin("FarmAdvanced");
            file = new File(plugin.getDataFolder(), "farm-config.yml");
            if(!file.exists()) {
                file.createNewFile();
            }
            configuration = YamlConfiguration.loadConfiguration(file);
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Farm Advanced] " + e.getMessage());
        }
    }

    public static FileConfiguration getConfiguration() { return configuration; }

    public static void save() {
        try {
            configuration.save(file);
            reload();
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Farm Advanced] " + e.getMessage());
        }
    }

    private static void reload() {
        configuration = YamlConfiguration.loadConfiguration(file);
    }
}
