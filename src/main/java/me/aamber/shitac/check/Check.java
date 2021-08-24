package me.aamber.shitac.check;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Check {
    public void fail(Player player, String check, String info, Object... object){
        Bukkit.getServer().getOnlinePlayers().stream()
                .filter(p -> p.hasPermission("shitac.alerts"))
                .forEach(pla -> pla.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7[&cShitAC&7] &c" + player.getName() + " &7detected for &c" + check + " &7[" + String.format(info,object) + "&7]")));
    }
}
