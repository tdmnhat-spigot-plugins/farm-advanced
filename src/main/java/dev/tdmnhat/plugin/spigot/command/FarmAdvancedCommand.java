package dev.tdmnhat.plugin.spigot.command;

import dev.tdmnhat.plugin.spigot.FarmAdvanced;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.jspecify.annotations.NonNull;

public class FarmAdvancedCommand implements CommandExecutor {

    private FarmAdvanced plugin;

    public FarmAdvancedCommand(FarmAdvanced plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NonNull CommandSender sender, @NonNull Command command, @NonNull String label, String[] args) {
        FileConfiguration configuration = plugin.getConfig();
        if(args.length == 0) {
            senderListHelpCommands(sender);
        } else if(args.length == 1) {
            switch(args[0]) {
                case "help": {
                    senderListHelpCommands(sender);
                    break;
                }
                default: {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', configuration.getString("command-not-exist")));
                    return false;
                }
            }
        }
        return true;
    }

    private void senderListHelpCommands(CommandSender sender) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f-------------------------------------------------"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/farmadvanced help:&a show list commands"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f------------------------------------------------"));
    }
}
